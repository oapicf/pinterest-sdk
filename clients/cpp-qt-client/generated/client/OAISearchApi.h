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

#ifndef OAI_OAISearchApi_H
#define OAI_OAISearchApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIError.h"
#include "OAIPins_list_200_response.h"
#include "OAISearch_partner_pins_200_response.h"
#include "OAISearch_user_boards_get_200_response.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAISearchApi : public QObject {
    Q_OBJECT

public:
    OAISearchApi(const int timeOut = 0);
    ~OAISearchApi();

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
    * @param[in]  term QString [required]
    * @param[in]  country_code QString [required]
    * @param[in]  bookmark QString [optional]
    * @param[in]  locale QString [optional]
    * @param[in]  limit qint32 [optional]
    */
    virtual void searchPartnerPins(const QString &term, const QString &country_code, const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &locale = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &limit = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  ad_account_id QString [optional]
    * @param[in]  bookmark QString [optional]
    * @param[in]  page_size qint32 [optional]
    * @param[in]  query QString [optional]
    */
    virtual void searchUserBoards_get(const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &query = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  query QString [required]
    * @param[in]  ad_account_id QString [optional]
    * @param[in]  bookmark QString [optional]
    */
    virtual void searchUserPins_list(const QString &query, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>());


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

    void searchPartnerPinsCallback(OAIHttpRequestWorker *worker);
    void searchUserBoards_getCallback(OAIHttpRequestWorker *worker);
    void searchUserPins_listCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void searchPartnerPinsSignal(OAISearch_partner_pins_200_response summary);
    void searchUserBoards_getSignal(OAISearch_user_boards_get_200_response summary);
    void searchUserPins_listSignal(OAIPins_list_200_response summary);


    void searchPartnerPinsSignalFull(OAIHttpRequestWorker *worker, OAISearch_partner_pins_200_response summary);
    void searchUserBoards_getSignalFull(OAIHttpRequestWorker *worker, OAISearch_user_boards_get_200_response summary);
    void searchUserPins_listSignalFull(OAIHttpRequestWorker *worker, OAIPins_list_200_response summary);

    Q_DECL_DEPRECATED_X("Use searchPartnerPinsSignalError() instead")
    void searchPartnerPinsSignalE(OAISearch_partner_pins_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void searchPartnerPinsSignalError(OAISearch_partner_pins_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use searchUserBoards_getSignalError() instead")
    void searchUserBoards_getSignalE(OAISearch_user_boards_get_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void searchUserBoards_getSignalError(OAISearch_user_boards_get_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use searchUserPins_listSignalError() instead")
    void searchUserPins_listSignalE(OAIPins_list_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void searchUserPins_listSignalError(OAIPins_list_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use searchPartnerPinsSignalErrorFull() instead")
    void searchPartnerPinsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void searchPartnerPinsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use searchUserBoards_getSignalErrorFull() instead")
    void searchUserBoards_getSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void searchUserBoards_getSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use searchUserPins_listSignalErrorFull() instead")
    void searchUserPins_listSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void searchUserPins_listSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif
