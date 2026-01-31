package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ConversionEventAppInfo {
    /* App ID in Google Play Store, AppStore or other stores. */
    String appId
    /* Name of the app. Primarily used for Mobile Apps. */
    String appName
    /* App package name */
    String appPackageName
    /* The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps */
    String appStore
    /* App version. Primarily used for mobile apps */
    String appVersion
    /* App install time. Unix timestamp in seconds */
    Integer installTime
    /* User Agent request header. Primarily used for Web events */
    String userAgent
    /* Inner height of the window or viewport. */
    Integer windowHeight
    /* Inner width of the window or viewport. */
    Integer windowWidth
}
