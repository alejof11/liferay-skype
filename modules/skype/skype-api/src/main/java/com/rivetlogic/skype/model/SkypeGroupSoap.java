/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.skype.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Rivet Logic
 * @generated
 */
@ProviderType
public class SkypeGroupSoap implements Serializable {
	public static SkypeGroupSoap toSoapModel(SkypeGroup model) {
		SkypeGroupSoap soapModel = new SkypeGroupSoap();

		soapModel.setSkypeGroupId(model.getSkypeGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setGroupName(model.getGroupName());
		soapModel.setSkypeContacts(model.getSkypeContacts());

		return soapModel;
	}

	public static SkypeGroupSoap[] toSoapModels(SkypeGroup[] models) {
		SkypeGroupSoap[] soapModels = new SkypeGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SkypeGroupSoap[][] toSoapModels(SkypeGroup[][] models) {
		SkypeGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SkypeGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SkypeGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SkypeGroupSoap[] toSoapModels(List<SkypeGroup> models) {
		List<SkypeGroupSoap> soapModels = new ArrayList<SkypeGroupSoap>(models.size());

		for (SkypeGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SkypeGroupSoap[soapModels.size()]);
	}

	public SkypeGroupSoap() {
	}

	public long getPrimaryKey() {
		return _skypeGroupId;
	}

	public void setPrimaryKey(long pk) {
		setSkypeGroupId(pk);
	}

	public long getSkypeGroupId() {
		return _skypeGroupId;
	}

	public void setSkypeGroupId(long skypeGroupId) {
		_skypeGroupId = skypeGroupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getGroupName() {
		return _groupName;
	}

	public void setGroupName(String groupName) {
		_groupName = groupName;
	}

	public String getSkypeContacts() {
		return _skypeContacts;
	}

	public void setSkypeContacts(String skypeContacts) {
		_skypeContacts = skypeContacts;
	}

	private long _skypeGroupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _groupName;
	private String _skypeContacts;
}