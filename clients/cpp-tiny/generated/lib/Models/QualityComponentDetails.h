
/*
 * QualityComponentDetails.h
 *
 * Metrics for a specific event type within a quality component.
 */

#ifndef TINY_CPP_CLIENT_QualityComponentDetails_H_
#define TINY_CPP_CLIENT_QualityComponentDetails_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "QualityComponentIssue.h"
#include <list>

namespace Tiny {


/*! \brief Metrics for a specific event type within a quality component.
 *
 *  \ingroup Models
 *
 */

class QualityComponentDetails{
public:

    /*! \brief Constructor.
	 */
    QualityComponentDetails();
    QualityComponentDetails(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QualityComponentDetails();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Coverage percentage for this event type.
	 */
	long getCoverage();

	/*! \brief Set Coverage percentage for this event type.
	 */
	void setCoverage(long  coverage);
	/*! \brief Get List of issues detected for this event type, if any.
	 */
	std::list<QualityComponentIssue> getIssues();

	/*! \brief Set List of issues detected for this event type, if any.
	 */
	void setIssues(std::list <QualityComponentIssue> issues);
	/*! \brief Get Overlap percentage for this event type. Only populated for external_event_id
	 */
	long getOverlap();

	/*! \brief Set Overlap percentage for this event type. Only populated for external_event_id
	 */
	void setOverlap(long  overlap);


    private:
    long coverage{};
    std::list<QualityComponentIssue> issues;
    long overlap{};
};
}

#endif /* TINY_CPP_CLIENT_QualityComponentDetails_H_ */
