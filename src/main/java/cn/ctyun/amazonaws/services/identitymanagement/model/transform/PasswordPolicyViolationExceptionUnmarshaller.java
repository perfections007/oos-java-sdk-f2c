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

import org.w3c.dom.Node;

import cn.ctyun.amazonaws.AmazonServiceException;
import cn.ctyun.amazonaws.services.identitymanagement.model.PasswordPolicyViolationException;
import cn.ctyun.amazonaws.transform.StandardErrorUnmarshaller;
import cn.ctyun.amazonaws.util.XpathUtils;

public class PasswordPolicyViolationExceptionUnmarshaller extends StandardErrorUnmarshaller {

    public PasswordPolicyViolationExceptionUnmarshaller() {
        super(PasswordPolicyViolationException.class);
    }

    public AmazonServiceException unmarshall(Node node) throws Exception {
        // Bail out if this isn't the right error code that this
        // marshaller understands.
        String errorCode = parseErrorCode(node);
        if (errorCode == null || !errorCode.equals("PasswordPolicyViolation"))
            return null;

        PasswordPolicyViolationException e = (PasswordPolicyViolationException)super.unmarshall(node);
        
        return e;
    }
}
    