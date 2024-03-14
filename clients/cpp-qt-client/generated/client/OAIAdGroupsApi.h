/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef OAI_OAIAdGroupsApi_H
#define OAI_OAIAdGroupsApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIAdGroupArrayResponse.h"
#include "OAIAdGroupCreateRequest.h"
#include "OAIAdGroupResponse.h"
#include "OAIAdGroupUpdateRequest.h"
#include "OAIAdGroupsAnalyticsResponse_inner.h"
#include "OAIAd_groups_list_200_response.h"
#include "OAIAdsAnalyticsTargetingType.h"
#include "OAIBidFloor.h"
#include "OAIBidFloorRequest.h"
#include "OAIConversionReportAttributionType.h"
#include "OAIError.h"
#include "OAIGranularity.h"
#include "OAIMetricsResponse.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIAdGroupsApi : public QObject {
    Q_OBJECT

public:
    OAIAdGroupsApi(const int timeOut = 0);
    ~OAIAdGroupsApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  oai_bid_floor_request OAIBidFloorRequest [required]
    */
    void adGroupsBidFloor_get(const QString &ad_account_id, const OAIBidFloorRequest &oai_bid_floor_request);

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  ad_group_ids QList<QString> [required]
    * @param[in]  start_date QDate [required]
    * @param[in]  end_date QDate [required]
    * @param[in]  targeting_types QList<OAIAdsAnalyticsTargetingType> [required]
    * @param[in]  columns QList<QString> [required]
    * @param[in]  granularity OAIGranularity [required]
    * @param[in]  click_window_days qint32 [optional]
    * @param[in]  engagement_window_days qint32 [optional]
    * @param[in]  view_window_days qint32 [optional]
    * @param[in]  conversion_report_time QString [optional]
    * @param[in]  attribution_types OAIConversionReportAttributionType [optional]
    */
    void adGroupsTargetingAnalytics_get(const QString &ad_account_id, const QList<QString> &ad_group_ids, const QDate &start_date, const QDate &end_date, const QList<OAIAdsAnalyticsTargetingType> &targeting_types, const QList<QString> &columns, const OAIGranularity &granularity, const ::OpenAPI::OptionalParam<qint32> &click_window_days = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<qint32> &engagement_window_days = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<qint32> &view_window_days = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &conversion_report_time = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<OAIConversionReportAttributionType> &attribution_types = ::OpenAPI::OptionalParam<OAIConversionReportAttributionType>());

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  start_date QDate [required]
    * @param[in]  end_date QDate [required]
    * @param[in]  ad_group_ids QList<QString> [required]
    * @param[in]  columns QList<QString> [required]
    * @param[in]  granularity OAIGranularity [required]
    * @param[in]  click_window_days qint32 [optional]
    * @param[in]  engagement_window_days qint32 [optional]
    * @param[in]  view_window_days qint32 [optional]
    * @param[in]  conversion_report_time QString [optional]
    */
    void adGroups_analytics(const QString &ad_account_id, const QDate &start_date, const QDate &end_date, const QList<QString> &ad_group_ids, const QList<QString> &columns, const OAIGranularity &granularity, const ::OpenAPI::OptionalParam<qint32> &click_window_days = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<qint32> &engagement_window_days = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<qint32> &view_window_days = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &conversion_report_time = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  oaiad_group_create_request QList<OAIAdGroupCreateRequest> [required]
    */
    void adGroups_create(const QString &ad_account_id, const QList<OAIAdGroupCreateRequest> &oaiad_group_create_request);

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  ad_group_id QString [required]
    */
    void adGroups_get(const QString &ad_account_id, const QString &ad_group_id);

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  campaign_ids QList<QString> [optional]
    * @param[in]  ad_group_ids QList<QString> [optional]
    * @param[in]  entity_statuses QList<QString> [optional]
    * @param[in]  page_size qint32 [optional]
    * @param[in]  order QString [optional]
    * @param[in]  bookmark QString [optional]
    * @param[in]  translate_interests_to_names bool [optional]
    */
    void adGroups_list(const QString &ad_account_id, const ::OpenAPI::OptionalParam<QList<QString>> &campaign_ids = ::OpenAPI::OptionalParam<QList<QString>>(), const ::OpenAPI::OptionalParam<QList<QString>> &ad_group_ids = ::OpenAPI::OptionalParam<QList<QString>>(), const ::OpenAPI::OptionalParam<QList<QString>> &entity_statuses = ::OpenAPI::OptionalParam<QList<QString>>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &order = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<bool> &translate_interests_to_names = ::OpenAPI::OptionalParam<bool>());

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  oaiad_group_update_request QList<OAIAdGroupUpdateRequest> [required]
    */
    void adGroups_update(const QString &ad_account_id, const QList<OAIAdGroupUpdateRequest> &oaiad_group_update_request);


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void adGroupsBidFloor_getCallback(OAIHttpRequestWorker *worker);
    void adGroupsTargetingAnalytics_getCallback(OAIHttpRequestWorker *worker);
    void adGroups_analyticsCallback(OAIHttpRequestWorker *worker);
    void adGroups_createCallback(OAIHttpRequestWorker *worker);
    void adGroups_getCallback(OAIHttpRequestWorker *worker);
    void adGroups_listCallback(OAIHttpRequestWorker *worker);
    void adGroups_updateCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void adGroupsBidFloor_getSignal(OAIBidFloor summary);
    void adGroupsTargetingAnalytics_getSignal(OAIMetricsResponse summary);
    void adGroups_analyticsSignal(QList<OAIAdGroupsAnalyticsResponse_inner> summary);
    void adGroups_createSignal(OAIAdGroupArrayResponse summary);
    void adGroups_getSignal(OAIAdGroupResponse summary);
    void adGroups_listSignal(OAIAd_groups_list_200_response summary);
    void adGroups_updateSignal(OAIAdGroupArrayResponse summary);

    void adGroupsBidFloor_getSignalFull(OAIHttpRequestWorker *worker, OAIBidFloor summary);
    void adGroupsTargetingAnalytics_getSignalFull(OAIHttpRequestWorker *worker, OAIMetricsResponse summary);
    void adGroups_analyticsSignalFull(OAIHttpRequestWorker *worker, QList<OAIAdGroupsAnalyticsResponse_inner> summary);
    void adGroups_createSignalFull(OAIHttpRequestWorker *worker, OAIAdGroupArrayResponse summary);
    void adGroups_getSignalFull(OAIHttpRequestWorker *worker, OAIAdGroupResponse summary);
    void adGroups_listSignalFull(OAIHttpRequestWorker *worker, OAIAd_groups_list_200_response summary);
    void adGroups_updateSignalFull(OAIHttpRequestWorker *worker, OAIAdGroupArrayResponse summary);

    Q_DECL_DEPRECATED_X("Use adGroupsBidFloor_getSignalError() instead")
    void adGroupsBidFloor_getSignalE(OAIBidFloor summary, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroupsBidFloor_getSignalError(OAIBidFloor summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroupsTargetingAnalytics_getSignalError() instead")
    void adGroupsTargetingAnalytics_getSignalE(OAIMetricsResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroupsTargetingAnalytics_getSignalError(OAIMetricsResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_analyticsSignalError() instead")
    void adGroups_analyticsSignalE(QList<OAIAdGroupsAnalyticsResponse_inner> summary, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_analyticsSignalError(QList<OAIAdGroupsAnalyticsResponse_inner> summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_createSignalError() instead")
    void adGroups_createSignalE(OAIAdGroupArrayResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_createSignalError(OAIAdGroupArrayResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_getSignalError() instead")
    void adGroups_getSignalE(OAIAdGroupResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_getSignalError(OAIAdGroupResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_listSignalError() instead")
    void adGroups_listSignalE(OAIAd_groups_list_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_listSignalError(OAIAd_groups_list_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_updateSignalError() instead")
    void adGroups_updateSignalE(OAIAdGroupArrayResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_updateSignalError(OAIAdGroupArrayResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use adGroupsBidFloor_getSignalErrorFull() instead")
    void adGroupsBidFloor_getSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroupsBidFloor_getSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroupsTargetingAnalytics_getSignalErrorFull() instead")
    void adGroupsTargetingAnalytics_getSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroupsTargetingAnalytics_getSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_analyticsSignalErrorFull() instead")
    void adGroups_analyticsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_analyticsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_createSignalErrorFull() instead")
    void adGroups_createSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_createSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_getSignalErrorFull() instead")
    void adGroups_getSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_getSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_listSignalErrorFull() instead")
    void adGroups_listSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_listSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adGroups_updateSignalErrorFull() instead")
    void adGroups_updateSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void adGroups_updateSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif