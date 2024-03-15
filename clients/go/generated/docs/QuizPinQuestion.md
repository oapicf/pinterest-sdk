# QuizPinQuestion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuestionId** | Pointer to **float32** |  | [optional] 
**QuestionText** | Pointer to **string** |  | [optional] 
**Options** | Pointer to [**[]QuizPinOption**](QuizPinOption.md) |  | [optional] 

## Methods

### NewQuizPinQuestion

`func NewQuizPinQuestion() *QuizPinQuestion`

NewQuizPinQuestion instantiates a new QuizPinQuestion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuizPinQuestionWithDefaults

`func NewQuizPinQuestionWithDefaults() *QuizPinQuestion`

NewQuizPinQuestionWithDefaults instantiates a new QuizPinQuestion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuestionId

`func (o *QuizPinQuestion) GetQuestionId() float32`

GetQuestionId returns the QuestionId field if non-nil, zero value otherwise.

### GetQuestionIdOk

`func (o *QuizPinQuestion) GetQuestionIdOk() (*float32, bool)`

GetQuestionIdOk returns a tuple with the QuestionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestionId

`func (o *QuizPinQuestion) SetQuestionId(v float32)`

SetQuestionId sets QuestionId field to given value.

### HasQuestionId

`func (o *QuizPinQuestion) HasQuestionId() bool`

HasQuestionId returns a boolean if a field has been set.

### GetQuestionText

`func (o *QuizPinQuestion) GetQuestionText() string`

GetQuestionText returns the QuestionText field if non-nil, zero value otherwise.

### GetQuestionTextOk

`func (o *QuizPinQuestion) GetQuestionTextOk() (*string, bool)`

GetQuestionTextOk returns a tuple with the QuestionText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestionText

`func (o *QuizPinQuestion) SetQuestionText(v string)`

SetQuestionText sets QuestionText field to given value.

### HasQuestionText

`func (o *QuizPinQuestion) HasQuestionText() bool`

HasQuestionText returns a boolean if a field has been set.

### GetOptions

`func (o *QuizPinQuestion) GetOptions() []QuizPinOption`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *QuizPinQuestion) GetOptionsOk() (*[]QuizPinOption, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *QuizPinQuestion) SetOptions(v []QuizPinOption)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *QuizPinQuestion) HasOptions() bool`

HasOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


