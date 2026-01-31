/*
 * EventQualityScore.h
 *
 * Schema for GET Conversion EQS response.
 */

#ifndef _EventQualityScore_H_
#define _EventQualityScore_H_


#include <string>
#include "IngestionSourceOptions.h"
#include "LookbackPeriodOptions.h"
#include "OverallStatusOptions.h"
#include "QualityComponents.h"
#include "SourcePlatformOptions.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Schema for GET Conversion EQS response.
 *
 *  \ingroup Models
 *
 */

class EventQualityScore : public Object {
public:
	/*! \brief Constructor.
	 */
	EventQualityScore();
	EventQualityScore(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EventQualityScore();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	IngestionSourceOptions getIngestionSource();

	/*! \brief Set 
	 */
	void setIngestionSource(IngestionSourceOptions  ingestion_source);
	/*! \brief Get 
	 */
	LookbackPeriodOptions getLookbackPeriod();

	/*! \brief Set 
	 */
	void setLookbackPeriod(LookbackPeriodOptions  lookback_period);
	/*! \brief Get 
	 */
	OverallStatusOptions getOverallStatus();

	/*! \brief Set 
	 */
	void setOverallStatus(OverallStatusOptions  overall_status);
	/*! \brief Get 
	 */
	QualityComponents getQualityComponents();

	/*! \brief Set 
	 */
	void setQualityComponents(QualityComponents  quality_components);
	/*! \brief Get 
	 */
	SourcePlatformOptions getSourcePlatform();

	/*! \brief Set 
	 */
	void setSourcePlatform(SourcePlatformOptions  source_platform);

private:
	IngestionSourceOptions ingestion_source;
	LookbackPeriodOptions lookback_period;
	OverallStatusOptions overall_status;
	QualityComponents quality_components;
	SourcePlatformOptions source_platform;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EventQualityScore_H_ */
