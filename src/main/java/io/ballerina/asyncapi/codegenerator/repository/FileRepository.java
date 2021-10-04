/*
 *  Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.ballerina.asyncapi.codegenerator.repository;

import io.ballerina.asyncapi.codegenerator.configuration.BallerinaAsyncApiException;

public interface FileRepository {
    String getFileContent(String filePath) throws BallerinaAsyncApiException;
    String getFileContentFromResources(String fileName) throws BallerinaAsyncApiException;
    void writeToFile(String filePath, String content) throws BallerinaAsyncApiException;
    String convertYamlToJson(String yaml) throws BallerinaAsyncApiException;
}
