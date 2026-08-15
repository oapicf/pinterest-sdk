
/*
 * LabelCreateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LabelCreateRequest_H_
#define TINY_CPP_CLIENT_LabelCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LabelCreateRequest_labels_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LabelCreateRequest{
public:

    /*! \brief Constructor.
	 */
    LabelCreateRequest();
    LabelCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Labels that you are applying to the campaign.
	 */
	std::list<LabelCreateRequest_labels_inner> getLabels();

	/*! \brief Set Labels that you are applying to the campaign.
	 */
	void setLabels(std::list <LabelCreateRequest_labels_inner> labels);
	/*! \brief Get Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	 */
	std::string getParentId();

	/*! \brief Set Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	 */
	void setParentId(std::string  parent_id);


    private:
    std::list<LabelCreateRequest_labels_inner> labels;
    std::string parent_id{};
};
}

#endif /* TINY_CPP_CLIENT_LabelCreateRequest_H_ */
