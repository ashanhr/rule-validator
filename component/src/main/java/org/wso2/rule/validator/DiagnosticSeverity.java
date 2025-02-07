/*
 *  Copyright (c) 2025, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.rule.validator;

/**
 * Enum to represent the severity of a rule
 */
public enum DiagnosticSeverity {
    ERROR,
    WARN,
    INFO,
    HINT,
    OFF;

    public static String getSeverityString(DiagnosticSeverity severity) {
        switch (severity) {
            case ERROR:
                return "error";
            case WARN:
                return "warn";
            case INFO:
                return "info";
            case HINT:
                return "hint";
            case OFF:
                return "off";
            default:
                return "off";
        }
    }
}
