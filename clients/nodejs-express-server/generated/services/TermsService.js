/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List related terms
* Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
*
* terms List List of input terms.
* returns RelatedTerms
* */
const terms_related/list = ({ terms }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        terms,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List suggested terms
* Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
*
* term String Input term.
* limit Integer Max suggested terms to return. (optional)
* returns List
* */
const terms_suggested/list = ({ term, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        term,
        limit,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  terms_related/list,
  terms_suggested/list,
};
