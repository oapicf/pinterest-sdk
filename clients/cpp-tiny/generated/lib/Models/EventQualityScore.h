
/*
 * EventQualityScore.h
 *
 * Schema for GET Conversion EQS response.
 */

#ifndef TINY_CPP_CLIENT_EventQualityScore_H_
#define TINY_CPP_CLIENT_EventQualityScore_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "IngestionSourceOptions.h"
#include "LookbackPeriodOptions.h"
#include "OverallStatusOptions.h"
#include "QualityComponents.h"
#include "SourcePlatformOptions.h"

namespace Tiny {


/*! \brief Schema for GET Conversion EQS response.
 *
 *  \ingroup Models
 *
 */

class EventQualityScore{
public:

    /*! \brief Constructor.
	 */
    EventQualityScore();
    EventQualityScore(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EventQualityScore();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	IngestionSourceOptions getIngestionSource();

	/*! \brief Set 
	 */
	void setIngestionSource(IngestionSourceOptions ingestion_source);
	/*! \brief Get 
	 */
	LookbackPeriodOptions getLookbackPeriod();

	/*! \brief Set 
	 */
	void setLookbackPeriod(LookbackPeriodOptions lookback_period);
	/*! \brief Get 
	 */
	OverallStatusOptions getOverallStatus();

	/*! \brief Set 
	 */
	void setOverallStatus(OverallStatusOptions overall_status);
	/*! \brief Get 
	 */
	QualityComponents getQualityComponents();

	/*! \brief Set 
	 */
	void setQualityComponents(QualityComponents quality_components);
	/*! \brief Get 
	 */
	SourcePlatformOptions getSourcePlatform();

	/*! \brief Set 
	 */
	void setSourcePlatform(SourcePlatformOptions source_platform);


    private:
    IngestionSourceOptions ingestion_source;
    LookbackPeriodOptions lookback_period;
    OverallStatusOptions overall_status;
    QualityComponents quality_components;
    SourcePlatformOptions source_platform;
};
}

#endif /* TINY_CPP_CLIENT_EventQualityScore_H_ */
