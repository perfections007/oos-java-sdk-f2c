/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package cn.ctyun.amazonaws.services.support.model.transform;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import cn.ctyun.amazonaws.AmazonClientException;
import cn.ctyun.amazonaws.DefaultRequest;
import cn.ctyun.amazonaws.Request;
import cn.ctyun.amazonaws.http.HttpMethodName;
import cn.ctyun.amazonaws.services.support.model.*;
import cn.ctyun.amazonaws.transform.Marshaller;
import cn.ctyun.amazonaws.util.BinaryUtils;
import cn.ctyun.amazonaws.util.StringInputStream;
import cn.ctyun.amazonaws.util.StringUtils;
import cn.ctyun.amazonaws.util.json.*;

import java.util.List;

/**
 * Describe Trusted Advisor Check Refresh Statuses Request Marshaller
 */
public class DescribeTrustedAdvisorCheckRefreshStatusesRequestMarshaller implements Marshaller<Request<DescribeTrustedAdvisorCheckRefreshStatusesRequest>, DescribeTrustedAdvisorCheckRefreshStatusesRequest> {

    

    public Request<DescribeTrustedAdvisorCheckRefreshStatusesRequest> marshall(DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest) {
    if (describeTrustedAdvisorCheckRefreshStatusesRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<DescribeTrustedAdvisorCheckRefreshStatusesRequest> request = new DefaultRequest<DescribeTrustedAdvisorCheckRefreshStatusesRequest>(describeTrustedAdvisorCheckRefreshStatusesRequest, "AWSSupport");
        String target = "AWSSupport_20130415.DescribeTrustedAdvisorCheckRefreshStatuses";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.1");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          

            cn.ctyun.amazonaws.internal.ListWithAutoConstructFlag<String> checkIdsList = (cn.ctyun.amazonaws.internal.ListWithAutoConstructFlag<String>)(describeTrustedAdvisorCheckRefreshStatusesRequest.getCheckIds());
            if (checkIdsList != null && !(checkIdsList.isAutoConstruct() && checkIdsList.isEmpty())) {

                jsonWriter.key("checkIds");
                jsonWriter.array();

                for (String checkIdsListValue : checkIdsList) {
                    if (checkIdsListValue != null) {
                        jsonWriter.value(checkIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
