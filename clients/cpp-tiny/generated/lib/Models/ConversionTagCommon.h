
/*
 * ConversionTagCommon.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionTagCommon_H_
#define TINY_CPP_CLIENT_ConversionTagCommon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionTagConfigs.h"
#include "EnhancedMatchStatusType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionTagCommon{
public:

    /*! \brief Constructor.
	 */
    ConversionTagCommon();
    ConversionTagCommon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionTagCommon();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Tag code snippet.
	 */
	std::string getCodeSnippet();

	/*! \brief Set Tag code snippet.
	 */
	void setCodeSnippet(std::string code_snippet);
	/*! \brief Get 
	 */
	ConversionTagConfigs getConfigs();

	/*! \brief Set 
	 */
	void setConfigs(ConversionTagConfigs configs);
	/*! \brief Get The enhanced match status of the tag
	 */
	EnhancedMatchStatusType getEnhancedMatchStatus();

	/*! \brief Set The enhanced match status of the tag
	 */
	void setEnhancedMatchStatus(EnhancedMatchStatusType enhanced_match_status);
	/*! \brief Get Tag ID.
	 */
	std::string getId();

	/*! \brief Set Tag ID.
	 */
	void setId(std::string id);
	/*! \brief Get Time for the last event fired.
	 */
	long getLastFiredTimeMs();

	/*! \brief Set Time for the last event fired.
	 */
	void setLastFiredTimeMs(long last_fired_time_ms);
	/*! \brief Get Conversion tag name.
	 */
	std::string getName();

	/*! \brief Set Conversion tag name.
	 */
	void setName(std::string name);
	/*! \brief Get Version number.
	 */
	std::string getVersion();

	/*! \brief Set Version number.
	 */
	void setVersion(std::string version);


    private:
    std::string code_snippet{};
    ConversionTagConfigs configs;
    EnhancedMatchStatusType enhanced_match_status;
    std::string id{};
    long last_fired_time_ms{};
    std::string name{};
    std::string version{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionTagCommon_H_ */
