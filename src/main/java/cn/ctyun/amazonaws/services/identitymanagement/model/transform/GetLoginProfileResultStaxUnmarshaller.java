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

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import cn.ctyun.amazonaws.services.identitymanagement.model.*;
import cn.ctyun.amazonaws.transform.MapEntry;
import cn.ctyun.amazonaws.transform.StaxUnmarshallerContext;
import cn.ctyun.amazonaws.transform.Unmarshaller;
import cn.ctyun.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Get Login Profile Result StAX Unmarshaller
 */
public class GetLoginProfileResultStaxUnmarshaller implements Unmarshaller<GetLoginProfileResult, StaxUnmarshallerContext> {

    public GetLoginProfileResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetLoginProfileResult getLoginProfileResult = new GetLoginProfileResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return getLoginProfileResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("LoginProfile", targetDepth)) {
                    getLoginProfileResult.setLoginProfile(LoginProfileStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getLoginProfileResult;
                }
            }
        }
    }

    private static GetLoginProfileResultStaxUnmarshaller instance;
    public static GetLoginProfileResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new GetLoginProfileResultStaxUnmarshaller();
        return instance;
    }
}
    