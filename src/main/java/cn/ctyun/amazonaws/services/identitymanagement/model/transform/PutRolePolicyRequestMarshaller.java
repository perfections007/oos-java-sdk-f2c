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
package cn.ctyun.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.ctyun.amazonaws.AmazonClientException;
import cn.ctyun.amazonaws.DefaultRequest;
import cn.ctyun.amazonaws.Request;
import cn.ctyun.amazonaws.services.identitymanagement.model.*;
import cn.ctyun.amazonaws.transform.Marshaller;
import cn.ctyun.amazonaws.util.StringUtils;

/**
 * Put Role Policy Request Marshaller
 */
public class PutRolePolicyRequestMarshaller implements Marshaller<Request<PutRolePolicyRequest>, PutRolePolicyRequest> {

    public Request<PutRolePolicyRequest> marshall(PutRolePolicyRequest putRolePolicyRequest) {

        if (putRolePolicyRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<PutRolePolicyRequest> request = new DefaultRequest<PutRolePolicyRequest>(putRolePolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "PutRolePolicy");
        request.addParameter("Version", "2010-05-08");

        if (putRolePolicyRequest.getRoleName() != null) {
            request.addParameter("RoleName", StringUtils.fromString(putRolePolicyRequest.getRoleName()));
        }
        if (putRolePolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(putRolePolicyRequest.getPolicyName()));
        }
        if (putRolePolicyRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(putRolePolicyRequest.getPolicyDocument()));
        }


        return request;
    }
}
