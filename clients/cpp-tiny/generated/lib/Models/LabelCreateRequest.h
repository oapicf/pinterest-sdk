
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
#include "LabelCreateItem.h"
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
	std::list<LabelCreateItem> getLabels();

	/*! \brief Set Labels that you are applying to the campaign.
	 */
	void setLabels(std::list<LabelCreateItem> labels);


    private:
    std::list<LabelCreateItem> labels;
};
}

#endif /* TINY_CPP_CLIENT_LabelCreateRequest_H_ */
