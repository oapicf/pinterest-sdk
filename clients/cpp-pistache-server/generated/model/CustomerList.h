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
/*
 * CustomerList.h
 *
 * 
 */

#ifndef CustomerList_H_
#define CustomerList_H_


#include <nlohmann/json.hpp>
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CustomerList
{
public:
    CustomerList();
    virtual ~CustomerList() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CustomerList& rhs) const;
    bool operator!=(const CustomerList& rhs) const;

    /////////////////////////////////////////////
    /// CustomerList members

    /// <summary>
    /// Associated ad account ID.
    /// </summary>
    std::string getAdAccountId() const;
    void setAdAccountId(std::string const& value);
    bool adAccountIdIsSet() const;
    void unsetAd_account_id();
    /// <summary>
    /// Creation time. Unix timestamp in seconds.
    /// </summary>
    double getCreatedTime() const;
    void setCreatedTime(double const value);
    bool createdTimeIsSet() const;
    void unsetCreated_time();
    /// <summary>
    /// Customer list ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// Customer list name.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
    /// </summary>
    double getNumBatches() const;
    void setNumBatches(double const value);
    bool numBatchesIsSet() const;
    void unsetNum_batches();
    /// <summary>
    /// Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list.
    /// </summary>
    double getNumRemovedUserRecords() const;
    void setNumRemovedUserRecords(double const value);
    bool numRemovedUserRecordsIsSet() const;
    void unsetNum_removed_user_records();
    /// <summary>
    /// Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list.
    /// </summary>
    double getNumUploadedUserRecords() const;
    void setNumUploadedUserRecords(double const value);
    bool numUploadedUserRecordsIsSet() const;
    void unsetNum_uploaded_user_records();
    /// <summary>
    /// Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string const& value);
    bool statusIsSet() const;
    void unsetStatus();
    /// <summary>
    /// Always \&quot;customerlist\&quot;.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    bool typeIsSet() const;
    void unsetType();
    /// <summary>
    /// Last update time. Unix timestamp in seconds.
    /// </summary>
    double getUpdatedTime() const;
    void setUpdatedTime(double const value);
    bool updatedTimeIsSet() const;
    void unsetUpdated_time();
    /// <summary>
    /// Customer list errors
    /// </summary>
    nlohmann::json getExceptions() const;
    void setExceptions(nlohmann::json const& value);
    bool exceptionsIsSet() const;
    void unsetExceptions();

    friend  void to_json(nlohmann::json& j, const CustomerList& o);
    friend  void from_json(const nlohmann::json& j, CustomerList& o);
protected:
    std::string m_Ad_account_id;
    bool m_Ad_account_idIsSet;
    double m_Created_time;
    bool m_Created_timeIsSet;
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    double m_Num_batches;
    bool m_Num_batchesIsSet;
    double m_Num_removed_user_records;
    bool m_Num_removed_user_recordsIsSet;
    double m_Num_uploaded_user_records;
    bool m_Num_uploaded_user_recordsIsSet;
    std::string m_Status;
    bool m_StatusIsSet;
    std::string m_Type;
    bool m_TypeIsSet;
    double m_Updated_time;
    bool m_Updated_timeIsSet;
    nlohmann::json m_Exceptions;
    bool m_ExceptionsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CustomerList_H_ */
