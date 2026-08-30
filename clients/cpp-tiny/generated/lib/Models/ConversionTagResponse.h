
/*
 * ConversionTagResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionTagResponse_H_
#define TINY_CPP_CLIENT_ConversionTagResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionTagConfigs.h"
#include "EnhancedMatchStatusType.h"
#include "EntityStatus.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionTagResponse{
public:

    /*! \brief Constructor.
	 */
    ConversionTagResponse();
    ConversionTagResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionTagResponse();


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
	/*! \brief Get Ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Ad account ID.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus status);


    private:
    std::string code_snippet{};
    ConversionTagConfigs configs;
    EnhancedMatchStatusType enhanced_match_status;
    std::string id{};
    long last_fired_time_ms{};
    std::string name{};
    std::string version{};
    std::string ad_account_id{};
    EntityStatus status;
};
}

#endif /* TINY_CPP_CLIENT_ConversionTagResponse_H_ */
