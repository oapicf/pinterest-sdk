/*
 * LabelsResponse.h
 *
 * 
 */

#ifndef _LabelsResponse_H_
#define _LabelsResponse_H_


#include <string>
#include "Label.h"
#include "LabelError.h"
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

class LabelsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelsResponse();
	LabelsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Labels that were not successfully applied.
	 */
	std::list<LabelError> getErrors();

	/*! \brief Set Labels that were not successfully applied.
	 */
	void setErrors(std::list <LabelError> errors);
	/*! \brief Get 
	 */
	std::list<Label> getLabels();

	/*! \brief Set 
	 */
	void setLabels(std::list <Label> labels);

private:
	std::list <LabelError>errors;
	std::list <Label>labels;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabelsResponse_H_ */
