/*
 * Copyright 2017 GcsSloop
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Last modified 2017-02-15 09:52:51
 *
 */

package com.gcssloop.diycode_sdk.event;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.gcssloop.diycode_sdk.api.base.event.BaseEvent;
import com.gcssloop.diycode_sdk.bean.TopicContent;

public class GetTopicContentEvent extends BaseEvent<TopicContent> {

    /**
     * @param uuid 唯一识别码
     */
    public GetTopicContentEvent(@Nullable String uuid) {
        super(uuid);
    }

    /**
     * @param uuid         唯一识别码
     * @param code         网络返回码
     * @param topicContent 实体数据
     */
    public GetTopicContentEvent(@Nullable String uuid, @NonNull Integer code, @Nullable TopicContent topicContent) {
        super(uuid, code, topicContent);
    }
}
