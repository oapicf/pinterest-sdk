/*
 * QualityComponentDetails.h
 *
 * Metrics for a specific event type within a quality component.
 */

#ifndef _QualityComponentDetails_H_
#define _QualityComponentDetails_H_


#include <string>
#include "QualityComponentIssue.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Metrics for a specific event type within a quality component.
 *
 *  \ingroup Models
 *
 */

class QualityComponentDetails : public Object {
public:
	/*! \brief Constructor.
	 */
	QualityComponentDetails();
	QualityComponentDetails(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QualityComponentDetails();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Coverage percentage for this event type.
	 */
	long long getCoverage();

	/*! \brief Set Coverage percentage for this event type.
	 */
	void setCoverage(long long  coverage);
	/*! \brief Get List of issues detected for this event type, if any.
	 */
	std::list<QualityComponentIssue> getIssues();

	/*! \brief Set List of issues detected for this event type, if any.
	 */
	void setIssues(std::list <QualityComponentIssue> issues);
	/*! \brief Get Overlap percentage for this event type. Only populated for external_event_id
	 */
	long long getOverlap();

	/*! \brief Set Overlap percentage for this event type. Only populated for external_event_id
	 */
	void setOverlap(long long  overlap);

private:
	long long coverage;
	std::list <QualityComponentIssue>issues;
	long long overlap;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QualityComponentDetails_H_ */
