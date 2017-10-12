/*
 * Copyright 2015 Hannes Dorfmann.
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
 */

package com.my_mvp_retrofit_rxjava.base;

/**
 * ========================================
 * <p/>
 * 版 权：dou361.com 版权所有 （C） 2015
 * <p/>
 * 作 者：陈冠明
 * <p/>
 * 个人网站：http://www.dou361.com
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/2/6 16:46
 * <p/>
 * 描 述：model的基类 业务具体处理，包括负责存储、检索、操纵数据等
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public abstract class BaseModel<SubP> {

    protected SubP mPresenter;

    public BaseModel(SubP presenter) {
        this.mPresenter = presenter;
    }

}

