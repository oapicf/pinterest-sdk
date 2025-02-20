/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef OAI_OAIBillingApi_H
#define OAI_OAIBillingApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIAdsCreditRedeemRequest.h"
#include "OAIAdsCreditRedeemResponse.h"
#include "OAIAds_credits_discounts_get_200_response.h"
#include "OAIBilling_profiles_get_200_response.h"
#include "OAIError.h"
#include "OAISSIOAccountResponse.h"
#include "OAISSIOCreateInsertionOrderRequest.h"
#include "OAISSIOCreateInsertionOrderResponse.h"
#include "OAISSIOEditInsertionOrderRequest.h"
#include "OAISSIOEditInsertionOrderResponse.h"
#include "OAISSIOInsertionOrderStatusResponse.h"
#include "OAISsio_insertion_orders_status_get_by_ad_account_200_response.h"
#include "OAISsio_order_lines_get_by_ad_account_200_response.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIBillingApi : public QObject {
    Q_OBJECT

public:
    OAIBillingApi(const int timeOut = 0);
    ~OAIBillingApi();

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
    * @param[in]  oai_ads_credit_redeem_request OAIAdsCreditRedeemRequest [required]
    */
    virtual void adsCredit_redeem(const QString &ad_account_id, const OAIAdsCreditRedeemRequest &oai_ads_credit_redeem_request);

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  bookmark QString [optional]
    * @param[in]  page_size qint32 [optional]
    */
    virtual void adsCreditsDiscounts_get(const QString &ad_account_id, const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  is_active bool [required]
    * @param[in]  bookmark QString [optional]
    * @param[in]  page_size qint32 [optional]
    */
    virtual void billingProfiles_get(const QString &ad_account_id, const bool &is_active, const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  ad_account_id QString [required]
    */
    virtual void ssioAccounts_get(const QString &ad_account_id);

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  oaissio_create_insertion_order_request OAISSIOCreateInsertionOrderRequest [required]
    */
    virtual void ssioInsertionOrder_create(const QString &ad_account_id, const OAISSIOCreateInsertionOrderRequest &oaissio_create_insertion_order_request);

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  oaissio_edit_insertion_order_request OAISSIOEditInsertionOrderRequest [required]
    */
    virtual void ssioInsertionOrder_edit(const QString &ad_account_id, const OAISSIOEditInsertionOrderRequest &oaissio_edit_insertion_order_request);

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  bookmark QString [optional]
    * @param[in]  page_size qint32 [optional]
    */
    virtual void ssioInsertionOrdersStatus_getByAdAccount(const QString &ad_account_id, const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  pin_order_id QString [required]
    */
    virtual void ssioInsertionOrdersStatus_getByPinOrderId(const QString &ad_account_id, const QString &pin_order_id);

    /**
    * @param[in]  ad_account_id QString [required]
    * @param[in]  bookmark QString [optional]
    * @param[in]  page_size qint32 [optional]
    * @param[in]  pin_order_id QString [optional]
    */
    virtual void ssioOrderLines_getByAdAccount(const QString &ad_account_id, const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &pin_order_id = ::OpenAPI::OptionalParam<QString>());


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

    void adsCredit_redeemCallback(OAIHttpRequestWorker *worker);
    void adsCreditsDiscounts_getCallback(OAIHttpRequestWorker *worker);
    void billingProfiles_getCallback(OAIHttpRequestWorker *worker);
    void ssioAccounts_getCallback(OAIHttpRequestWorker *worker);
    void ssioInsertionOrder_createCallback(OAIHttpRequestWorker *worker);
    void ssioInsertionOrder_editCallback(OAIHttpRequestWorker *worker);
    void ssioInsertionOrdersStatus_getByAdAccountCallback(OAIHttpRequestWorker *worker);
    void ssioInsertionOrdersStatus_getByPinOrderIdCallback(OAIHttpRequestWorker *worker);
    void ssioOrderLines_getByAdAccountCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void adsCredit_redeemSignal(OAIAdsCreditRedeemResponse summary);
    void adsCreditsDiscounts_getSignal(OAIAds_credits_discounts_get_200_response summary);
    void billingProfiles_getSignal(OAIBilling_profiles_get_200_response summary);
    void ssioAccounts_getSignal(OAISSIOAccountResponse summary);
    void ssioInsertionOrder_createSignal(OAISSIOCreateInsertionOrderResponse summary);
    void ssioInsertionOrder_editSignal(OAISSIOEditInsertionOrderResponse summary);
    void ssioInsertionOrdersStatus_getByAdAccountSignal(OAISsio_insertion_orders_status_get_by_ad_account_200_response summary);
    void ssioInsertionOrdersStatus_getByPinOrderIdSignal(OAISSIOInsertionOrderStatusResponse summary);
    void ssioOrderLines_getByAdAccountSignal(OAISsio_order_lines_get_by_ad_account_200_response summary);


    void adsCredit_redeemSignalFull(OAIHttpRequestWorker *worker, OAIAdsCreditRedeemResponse summary);
    void adsCreditsDiscounts_getSignalFull(OAIHttpRequestWorker *worker, OAIAds_credits_discounts_get_200_response summary);
    void billingProfiles_getSignalFull(OAIHttpRequestWorker *worker, OAIBilling_profiles_get_200_response summary);
    void ssioAccounts_getSignalFull(OAIHttpRequestWorker *worker, OAISSIOAccountResponse summary);
    void ssioInsertionOrder_createSignalFull(OAIHttpRequestWorker *worker, OAISSIOCreateInsertionOrderResponse summary);
    void ssioInsertionOrder_editSignalFull(OAIHttpRequestWorker *worker, OAISSIOEditInsertionOrderResponse summary);
    void ssioInsertionOrdersStatus_getByAdAccountSignalFull(OAIHttpRequestWorker *worker, OAISsio_insertion_orders_status_get_by_ad_account_200_response summary);
    void ssioInsertionOrdersStatus_getByPinOrderIdSignalFull(OAIHttpRequestWorker *worker, OAISSIOInsertionOrderStatusResponse summary);
    void ssioOrderLines_getByAdAccountSignalFull(OAIHttpRequestWorker *worker, OAISsio_order_lines_get_by_ad_account_200_response summary);

    Q_DECL_DEPRECATED_X("Use adsCredit_redeemSignalError() instead")
    void adsCredit_redeemSignalE(OAIAdsCreditRedeemResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void adsCredit_redeemSignalError(OAIAdsCreditRedeemResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adsCreditsDiscounts_getSignalError() instead")
    void adsCreditsDiscounts_getSignalE(OAIAds_credits_discounts_get_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void adsCreditsDiscounts_getSignalError(OAIAds_credits_discounts_get_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use billingProfiles_getSignalError() instead")
    void billingProfiles_getSignalE(OAIBilling_profiles_get_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void billingProfiles_getSignalError(OAIBilling_profiles_get_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioAccounts_getSignalError() instead")
    void ssioAccounts_getSignalE(OAISSIOAccountResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioAccounts_getSignalError(OAISSIOAccountResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioInsertionOrder_createSignalError() instead")
    void ssioInsertionOrder_createSignalE(OAISSIOCreateInsertionOrderResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioInsertionOrder_createSignalError(OAISSIOCreateInsertionOrderResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioInsertionOrder_editSignalError() instead")
    void ssioInsertionOrder_editSignalE(OAISSIOEditInsertionOrderResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioInsertionOrder_editSignalError(OAISSIOEditInsertionOrderResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioInsertionOrdersStatus_getByAdAccountSignalError() instead")
    void ssioInsertionOrdersStatus_getByAdAccountSignalE(OAISsio_insertion_orders_status_get_by_ad_account_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioInsertionOrdersStatus_getByAdAccountSignalError(OAISsio_insertion_orders_status_get_by_ad_account_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioInsertionOrdersStatus_getByPinOrderIdSignalError() instead")
    void ssioInsertionOrdersStatus_getByPinOrderIdSignalE(OAISSIOInsertionOrderStatusResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioInsertionOrdersStatus_getByPinOrderIdSignalError(OAISSIOInsertionOrderStatusResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioOrderLines_getByAdAccountSignalError() instead")
    void ssioOrderLines_getByAdAccountSignalE(OAISsio_order_lines_get_by_ad_account_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioOrderLines_getByAdAccountSignalError(OAISsio_order_lines_get_by_ad_account_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use adsCredit_redeemSignalErrorFull() instead")
    void adsCredit_redeemSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void adsCredit_redeemSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use adsCreditsDiscounts_getSignalErrorFull() instead")
    void adsCreditsDiscounts_getSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void adsCreditsDiscounts_getSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use billingProfiles_getSignalErrorFull() instead")
    void billingProfiles_getSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void billingProfiles_getSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioAccounts_getSignalErrorFull() instead")
    void ssioAccounts_getSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioAccounts_getSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioInsertionOrder_createSignalErrorFull() instead")
    void ssioInsertionOrder_createSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioInsertionOrder_createSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioInsertionOrder_editSignalErrorFull() instead")
    void ssioInsertionOrder_editSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioInsertionOrder_editSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioInsertionOrdersStatus_getByAdAccountSignalErrorFull() instead")
    void ssioInsertionOrdersStatus_getByAdAccountSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioInsertionOrdersStatus_getByAdAccountSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioInsertionOrdersStatus_getByPinOrderIdSignalErrorFull() instead")
    void ssioInsertionOrdersStatus_getByPinOrderIdSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioInsertionOrdersStatus_getByPinOrderIdSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use ssioOrderLines_getByAdAccountSignalErrorFull() instead")
    void ssioOrderLines_getByAdAccountSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void ssioOrderLines_getByAdAccountSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif
