/*
 * LabelUpdateRequest.h
 *
 * 
 */

#ifndef _LabelUpdateRequest_H_
#define _LabelUpdateRequest_H_


#include <string>
#include "LabelUpdateRequest_labels_inner.h"
#include <list>
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

class LabelUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelUpdateRequest();
	LabelUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Labels that you are applying to the campaign.
	 */
	std::list<LabelUpdateRequest_labels_inner> getLabels();

	/*! \brief Set Labels that you are applying to the campaign.
	 */
	void setLabels(std::list <LabelUpdateRequest_labels_inner> labels);

private:
	std::list <LabelUpdateRequest_labels_inner>labels;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabelUpdateRequest_H_ */
