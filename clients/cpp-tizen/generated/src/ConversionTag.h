/*
 * ConversionTag.h
 *
 * 
 */

#ifndef _ConversionTag_H_
#define _ConversionTag_H_


#include <string>
#include "ConversionTagConfigs.h"
#include "EnhancedMatchStatusType.h"
#include "EntityStatus.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionTag : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionTag();
	ConversionTag(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionTag();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Tag code snippet.
	 */
	std::string getCodeSnippet();

	/*! \brief Set Tag code snippet.
	 */
	void setCodeSnippet(std::string  code_snippet);
	/*! \brief Get 
	 */
	ConversionTagConfigs getConfigs();

	/*! \brief Set 
	 */
	void setConfigs(ConversionTagConfigs  configs);
	/*! \brief Get The enhanced match status of the tag
	 */
	EnhancedMatchStatusType getEnhancedMatchStatus();

	/*! \brief Set The enhanced match status of the tag
	 */
	void setEnhancedMatchStatus(EnhancedMatchStatusType  enhanced_match_status);
	/*! \brief Get Tag ID.
	 */
	std::string getId();

	/*! \brief Set Tag ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Time for the last event fired.
	 */
	long long getLastFiredTimeMs();

	/*! \brief Set Time for the last event fired.
	 */
	void setLastFiredTimeMs(long long  last_fired_time_ms);
	/*! \brief Get Conversion tag name.
	 */
	std::string getName();

	/*! \brief Set Conversion tag name.
	 */
	void setName(std::string  name);
	/*! \brief Get Version number.
	 */
	std::string getVersion();

	/*! \brief Set Version number.
	 */
	void setVersion(std::string  version);
	/*! \brief Get Ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Ad account ID.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);

private:
	std::string code_snippet;
	ConversionTagConfigs configs;
	EnhancedMatchStatusType enhanced_match_status;
	std::string id;
	long long last_fired_time_ms;
	std::string name;
	std::string version;
	std::string ad_account_id;
	EntityStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionTag_H_ */
