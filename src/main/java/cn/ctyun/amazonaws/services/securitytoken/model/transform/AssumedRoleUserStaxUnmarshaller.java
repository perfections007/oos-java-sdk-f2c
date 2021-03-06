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

package cn.ctyun.amazonaws.services.securitytoken.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import cn.ctyun.amazonaws.services.securitytoken.model.*;
import cn.ctyun.amazonaws.transform.MapEntry;
import cn.ctyun.amazonaws.transform.StaxUnmarshallerContext;
import cn.ctyun.amazonaws.transform.Unmarshaller;
import cn.ctyun.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Assumed Role User StAX Unmarshaller
 */
public class AssumedRoleUserStaxUnmarshaller implements Unmarshaller<AssumedRoleUser, StaxUnmarshallerContext> {

    public AssumedRoleUser unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssumedRoleUser assumedRoleUser = new AssumedRoleUser();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return assumedRoleUser;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("AssumedRoleId", targetDepth)) {
                    assumedRoleUser.setAssumedRoleId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Arn", targetDepth)) {
                    assumedRoleUser.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return assumedRoleUser;
                }
            }
        }
    }

    private static AssumedRoleUserStaxUnmarshaller instance;
    public static AssumedRoleUserStaxUnmarshaller getInstance() {
        if (instance == null) instance = new AssumedRoleUserStaxUnmarshaller();
        return instance;
    }
}
    