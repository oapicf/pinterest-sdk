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

#ifndef OAI_OAIBoardsApi_H
#define OAI_OAIBoardsApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIBoard.h"
#include "OAIBoardSection.h"
#include "OAIBoardUpdate.h"
#include "OAIBoard_sections_list_200_response.h"
#include "OAIBoards_list_200_response.h"
#include "OAIBoards_list_pins_200_response.h"
#include "OAIError.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIBoardsApi : public QObject {
    Q_OBJECT

public:
    OAIBoardsApi(const int timeOut = 0);
    ~OAIBoardsApi();

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
    * @param[in]  board_id QString [required]
    * @param[in]  oai_board_section OAIBoardSection [required]
    * @param[in]  ad_account_id QString [optional]
    */
    virtual void boardSections_create(const QString &board_id, const OAIBoardSection &oai_board_section, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  board_id QString [required]
    * @param[in]  section_id QString [required]
    * @param[in]  ad_account_id QString [optional]
    */
    virtual void boardSections_delete(const QString &board_id, const QString &section_id, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  board_id QString [required]
    * @param[in]  ad_account_id QString [optional]
    * @param[in]  bookmark QString [optional]
    * @param[in]  page_size qint32 [optional]
    */
    virtual void boardSections_list(const QString &board_id, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  board_id QString [required]
    * @param[in]  section_id QString [required]
    * @param[in]  ad_account_id QString [optional]
    * @param[in]  bookmark QString [optional]
    * @param[in]  page_size qint32 [optional]
    */
    virtual void boardSections_listPins(const QString &board_id, const QString &section_id, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  board_id QString [required]
    * @param[in]  section_id QString [required]
    * @param[in]  oai_board_section OAIBoardSection [required]
    * @param[in]  ad_account_id QString [optional]
    */
    virtual void boardSections_update(const QString &board_id, const QString &section_id, const OAIBoardSection &oai_board_section, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  oai_board OAIBoard [required]
    * @param[in]  ad_account_id QString [optional]
    */
    virtual void boards_create(const OAIBoard &oai_board, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  board_id QString [required]
    * @param[in]  ad_account_id QString [optional]
    */
    virtual void boards_delete(const QString &board_id, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  board_id QString [required]
    * @param[in]  ad_account_id QString [optional]
    */
    virtual void boards_get(const QString &board_id, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  ad_account_id QString [optional]
    * @param[in]  bookmark QString [optional]
    * @param[in]  page_size qint32 [optional]
    * @param[in]  privacy QString [optional]
    */
    virtual void boards_list(const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &privacy = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  board_id QString [required]
    * @param[in]  bookmark QString [optional]
    * @param[in]  page_size qint32 [optional]
    * @param[in]  creative_types QList<QString> [optional]
    * @param[in]  ad_account_id QString [optional]
    * @param[in]  pin_metrics bool [optional]
    */
    virtual void boards_listPins(const QString &board_id, const ::OpenAPI::OptionalParam<QString> &bookmark = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QList<QString>> &creative_types = ::OpenAPI::OptionalParam<QList<QString>>(), const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<bool> &pin_metrics = ::OpenAPI::OptionalParam<bool>());

    /**
    * @param[in]  board_id QString [required]
    * @param[in]  oai_board_update OAIBoardUpdate [required]
    * @param[in]  ad_account_id QString [optional]
    */
    virtual void boards_update(const QString &board_id, const OAIBoardUpdate &oai_board_update, const ::OpenAPI::OptionalParam<QString> &ad_account_id = ::OpenAPI::OptionalParam<QString>());


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

    void boardSections_createCallback(OAIHttpRequestWorker *worker);
    void boardSections_deleteCallback(OAIHttpRequestWorker *worker);
    void boardSections_listCallback(OAIHttpRequestWorker *worker);
    void boardSections_listPinsCallback(OAIHttpRequestWorker *worker);
    void boardSections_updateCallback(OAIHttpRequestWorker *worker);
    void boards_createCallback(OAIHttpRequestWorker *worker);
    void boards_deleteCallback(OAIHttpRequestWorker *worker);
    void boards_getCallback(OAIHttpRequestWorker *worker);
    void boards_listCallback(OAIHttpRequestWorker *worker);
    void boards_listPinsCallback(OAIHttpRequestWorker *worker);
    void boards_updateCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void boardSections_createSignal(OAIBoardSection summary);
    void boardSections_deleteSignal();
    void boardSections_listSignal(OAIBoard_sections_list_200_response summary);
    void boardSections_listPinsSignal(OAIBoards_list_pins_200_response summary);
    void boardSections_updateSignal(OAIBoardSection summary);
    void boards_createSignal(OAIBoard summary);
    void boards_deleteSignal();
    void boards_getSignal(OAIBoard summary);
    void boards_listSignal(OAIBoards_list_200_response summary);
    void boards_listPinsSignal(OAIBoards_list_pins_200_response summary);
    void boards_updateSignal(OAIBoard summary);


    void boardSections_createSignalFull(OAIHttpRequestWorker *worker, OAIBoardSection summary);
    void boardSections_deleteSignalFull(OAIHttpRequestWorker *worker);
    void boardSections_listSignalFull(OAIHttpRequestWorker *worker, OAIBoard_sections_list_200_response summary);
    void boardSections_listPinsSignalFull(OAIHttpRequestWorker *worker, OAIBoards_list_pins_200_response summary);
    void boardSections_updateSignalFull(OAIHttpRequestWorker *worker, OAIBoardSection summary);
    void boards_createSignalFull(OAIHttpRequestWorker *worker, OAIBoard summary);
    void boards_deleteSignalFull(OAIHttpRequestWorker *worker);
    void boards_getSignalFull(OAIHttpRequestWorker *worker, OAIBoard summary);
    void boards_listSignalFull(OAIHttpRequestWorker *worker, OAIBoards_list_200_response summary);
    void boards_listPinsSignalFull(OAIHttpRequestWorker *worker, OAIBoards_list_pins_200_response summary);
    void boards_updateSignalFull(OAIHttpRequestWorker *worker, OAIBoard summary);

    Q_DECL_DEPRECATED_X("Use boardSections_createSignalError() instead")
    void boardSections_createSignalE(OAIBoardSection summary, QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_createSignalError(OAIBoardSection summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boardSections_deleteSignalError() instead")
    void boardSections_deleteSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_deleteSignalError(QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boardSections_listSignalError() instead")
    void boardSections_listSignalE(OAIBoard_sections_list_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_listSignalError(OAIBoard_sections_list_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boardSections_listPinsSignalError() instead")
    void boardSections_listPinsSignalE(OAIBoards_list_pins_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_listPinsSignalError(OAIBoards_list_pins_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boardSections_updateSignalError() instead")
    void boardSections_updateSignalE(OAIBoardSection summary, QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_updateSignalError(OAIBoardSection summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_createSignalError() instead")
    void boards_createSignalE(OAIBoard summary, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_createSignalError(OAIBoard summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_deleteSignalError() instead")
    void boards_deleteSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void boards_deleteSignalError(QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_getSignalError() instead")
    void boards_getSignalE(OAIBoard summary, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_getSignalError(OAIBoard summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_listSignalError() instead")
    void boards_listSignalE(OAIBoards_list_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_listSignalError(OAIBoards_list_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_listPinsSignalError() instead")
    void boards_listPinsSignalE(OAIBoards_list_pins_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_listPinsSignalError(OAIBoards_list_pins_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_updateSignalError() instead")
    void boards_updateSignalE(OAIBoard summary, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_updateSignalError(OAIBoard summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use boardSections_createSignalErrorFull() instead")
    void boardSections_createSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_createSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boardSections_deleteSignalErrorFull() instead")
    void boardSections_deleteSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_deleteSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boardSections_listSignalErrorFull() instead")
    void boardSections_listSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_listSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boardSections_listPinsSignalErrorFull() instead")
    void boardSections_listPinsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_listPinsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boardSections_updateSignalErrorFull() instead")
    void boardSections_updateSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boardSections_updateSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_createSignalErrorFull() instead")
    void boards_createSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_createSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_deleteSignalErrorFull() instead")
    void boards_deleteSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_deleteSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_getSignalErrorFull() instead")
    void boards_getSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_getSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_listSignalErrorFull() instead")
    void boards_listSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_listSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_listPinsSignalErrorFull() instead")
    void boards_listPinsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_listPinsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use boards_updateSignalErrorFull() instead")
    void boards_updateSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void boards_updateSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif
