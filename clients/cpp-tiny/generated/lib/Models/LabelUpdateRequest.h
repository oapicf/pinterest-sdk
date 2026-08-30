
/*
 * LabelUpdateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LabelUpdateRequest_H_
#define TINY_CPP_CLIENT_LabelUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LabelUpdateItem.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LabelUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    LabelUpdateRequest();
    LabelUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelUpdateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Labels that you are applying to the campaign.
	 */
	std::list<LabelUpdateItem> getLabels();

	/*! \brief Set Labels that you are applying to the campaign.
	 */
	void setLabels(std::list<LabelUpdateItem> labels);


    private:
    std::list<LabelUpdateItem> labels;
};
}

#endif /* TINY_CPP_CLIENT_LabelUpdateRequest_H_ */
