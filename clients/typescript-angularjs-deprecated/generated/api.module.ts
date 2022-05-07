import * as api from './api/api';
import * as angular from 'angular';

const apiModule = angular.module('api', [])
.service('AdAccountsApi', api.AdAccountsApi)
.service('BoardsApi', api.BoardsApi)
.service('CatalogsApi', api.CatalogsApi)
.service('MediaApi', api.MediaApi)
.service('OauthApi', api.OauthApi)
.service('PinsApi', api.PinsApi)
.service('UserAccountApi', api.UserAccountApi)

export default apiModule;
