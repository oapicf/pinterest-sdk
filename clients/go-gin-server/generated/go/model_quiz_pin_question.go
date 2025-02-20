/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
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
