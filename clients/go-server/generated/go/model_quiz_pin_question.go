/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// QuizPinQuestion - A specific quiz inquiry.
type QuizPinQuestion struct {

	QuestionId float32 `json:"question_id,omitempty"`

	QuestionText string `json:"question_text,omitempty"`

	Options []QuizPinOption `json:"options,omitempty"`
}

// AssertQuizPinQuestionRequired checks if the required fields are not zero-ed
func AssertQuizPinQuestionRequired(obj QuizPinQuestion) error {
	for _, el := range obj.Options {
		if err := AssertQuizPinOptionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertQuizPinQuestionConstraints checks if the values respects the defined constraints
func AssertQuizPinQuestionConstraints(obj QuizPinQuestion) error {
	return nil
}