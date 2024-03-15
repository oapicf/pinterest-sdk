# QuizPinData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Questions** | Pointer to [**[]QuizPinQuestion**](QuizPinQuestion.md) |  | [optional] 
**Results** | Pointer to [**[]QuizPinResult**](QuizPinResult.md) |  | [optional] 

## Methods

### NewQuizPinData

`func NewQuizPinData() *QuizPinData`

NewQuizPinData instantiates a new QuizPinData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuizPinDataWithDefaults

`func NewQuizPinDataWithDefaults() *QuizPinData`

NewQuizPinDataWithDefaults instantiates a new QuizPinData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuestions

`func (o *QuizPinData) GetQuestions() []QuizPinQuestion`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *QuizPinData) GetQuestionsOk() (*[]QuizPinQuestion, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *QuizPinData) SetQuestions(v []QuizPinQuestion)`

SetQuestions sets Questions field to given value.

### HasQuestions

`func (o *QuizPinData) HasQuestions() bool`

HasQuestions returns a boolean if a field has been set.

### GetResults

`func (o *QuizPinData) GetResults() []QuizPinResult`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *QuizPinData) GetResultsOk() (*[]QuizPinResult, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *QuizPinData) SetResults(v []QuizPinResult)`

SetResults sets Results field to given value.

### HasResults

`func (o *QuizPinData) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


