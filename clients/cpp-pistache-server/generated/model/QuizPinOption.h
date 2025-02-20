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
 * QuizPinOption.h
 *
 *  This field contains multiple options to a quiz question.
 */

#ifndef QuizPinOption_H_
#define QuizPinOption_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
///  This field contains multiple options to a quiz question.
/// </summary>
class  QuizPinOption
{
public:
    QuizPinOption();
    virtual ~QuizPinOption() = default;


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

    bool operator==(const QuizPinOption& rhs) const;
    bool operator!=(const QuizPinOption& rhs) const;

    /////////////////////////////////////////////
    /// QuizPinOption members

    /// <summary>
    /// 
    /// </summary>
    double getId() const;
    void setId(double const value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// 
    /// </summary>
    std::string getText() const;
    void setText(std::string const& value);
    bool textIsSet() const;
    void unsetText();

    friend  void to_json(nlohmann::json& j, const QuizPinOption& o);
    friend  void from_json(const nlohmann::json& j, QuizPinOption& o);
protected:
    double m_Id;
    bool m_IdIsSet;
    std::string m_Text;
    bool m_TextIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* QuizPinOption_H_ */
