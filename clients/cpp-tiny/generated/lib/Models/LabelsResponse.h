
/*
 * LabelsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LabelsResponse_H_
#define TINY_CPP_CLIENT_LabelsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Label.h"
#include "LabelError.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LabelsResponse{
public:

    /*! \brief Constructor.
	 */
    LabelsResponse();
    LabelsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<LabelError> errors;
    std::list<Label> labels;
};
}

#endif /* TINY_CPP_CLIENT_LabelsResponse_H_ */
