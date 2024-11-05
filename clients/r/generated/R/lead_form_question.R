#' Create a new LeadFormQuestion
#'
#' @description
#' LeadFormQuestion Class
#'
#' @docType class
#' @title LeadFormQuestion
#' @description LeadFormQuestion Class
#' @format An \code{R6Class} generator object
#' @field question_type  \link{LeadFormQuestionType} [optional]
#' @field custom_question_field_type  \link{LeadFormQuestionFieldType} [optional]
#' @field custom_question_label Question label for a custom question. character [optional]
#' @field custom_question_options Question options for a custom question. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormQuestion <- R6::R6Class(
  "LeadFormQuestion",
  public = list(
    `question_type` = NULL,
    `custom_question_field_type` = NULL,
    `custom_question_label` = NULL,
    `custom_question_options` = NULL,

    #' @description
    #' Initialize a new LeadFormQuestion class.
    #'
    #' @param question_type question_type
    #' @param custom_question_field_type custom_question_field_type
    #' @param custom_question_label Question label for a custom question.
    #' @param custom_question_options Question options for a custom question.
    #' @param ... Other optional arguments.
    initialize = function(`question_type` = NULL, `custom_question_field_type` = NULL, `custom_question_label` = NULL, `custom_question_options` = NULL, ...) {
      if (!is.null(`question_type`)) {
        if (!(`question_type` %in% c())) {
          stop(paste("Error! \"", `question_type`, "\" cannot be assigned to `question_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`question_type`))
        self$`question_type` <- `question_type`
      }
      if (!is.null(`custom_question_field_type`)) {
        if (!(`custom_question_field_type` %in% c())) {
          stop(paste("Error! \"", `custom_question_field_type`, "\" cannot be assigned to `custom_question_field_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`custom_question_field_type`))
        self$`custom_question_field_type` <- `custom_question_field_type`
      }
      if (!is.null(`custom_question_label`)) {
        if (!(is.character(`custom_question_label`) && length(`custom_question_label`) == 1)) {
          stop(paste("Error! Invalid data for `custom_question_label`. Must be a string:", `custom_question_label`))
        }
        self$`custom_question_label` <- `custom_question_label`
      }
      if (!is.null(`custom_question_options`)) {
        stopifnot(is.vector(`custom_question_options`), length(`custom_question_options`) != 0)
        sapply(`custom_question_options`, function(x) stopifnot(is.character(x)))
        self$`custom_question_options` <- `custom_question_options`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormQuestion in JSON format
    toJSON = function() {
      LeadFormQuestionObject <- list()
      if (!is.null(self$`question_type`)) {
        LeadFormQuestionObject[["question_type"]] <-
          self$`question_type`$toJSON()
      }
      if (!is.null(self$`custom_question_field_type`)) {
        LeadFormQuestionObject[["custom_question_field_type"]] <-
          self$`custom_question_field_type`$toJSON()
      }
      if (!is.null(self$`custom_question_label`)) {
        LeadFormQuestionObject[["custom_question_label"]] <-
          self$`custom_question_label`
      }
      if (!is.null(self$`custom_question_options`)) {
        LeadFormQuestionObject[["custom_question_options"]] <-
          self$`custom_question_options`
      }
      LeadFormQuestionObject
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestion
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormQuestion
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`question_type`)) {
        `question_type_object` <- LeadFormQuestionType$new()
        `question_type_object`$fromJSON(jsonlite::toJSON(this_object$`question_type`, auto_unbox = TRUE, digits = NA))
        self$`question_type` <- `question_type_object`
      }
      if (!is.null(this_object$`custom_question_field_type`)) {
        `custom_question_field_type_object` <- LeadFormQuestionFieldType$new()
        `custom_question_field_type_object`$fromJSON(jsonlite::toJSON(this_object$`custom_question_field_type`, auto_unbox = TRUE, digits = NA))
        self$`custom_question_field_type` <- `custom_question_field_type_object`
      }
      if (!is.null(this_object$`custom_question_label`)) {
        self$`custom_question_label` <- this_object$`custom_question_label`
      }
      if (!is.null(this_object$`custom_question_options`)) {
        self$`custom_question_options` <- ApiClient$new()$deserializeObj(this_object$`custom_question_options`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormQuestion in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`question_type`)) {
          sprintf(
          '"question_type":
          %s
          ',
          jsonlite::toJSON(self$`question_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`custom_question_field_type`)) {
          sprintf(
          '"custom_question_field_type":
          %s
          ',
          jsonlite::toJSON(self$`custom_question_field_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`custom_question_label`)) {
          sprintf(
          '"custom_question_label":
            "%s"
                    ',
          self$`custom_question_label`
          )
        },
        if (!is.null(self$`custom_question_options`)) {
          sprintf(
          '"custom_question_options":
             [%s]
          ',
          paste(unlist(lapply(self$`custom_question_options`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestion
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormQuestion
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`question_type` <- LeadFormQuestionType$new()$fromJSON(jsonlite::toJSON(this_object$`question_type`, auto_unbox = TRUE, digits = NA))
      self$`custom_question_field_type` <- LeadFormQuestionFieldType$new()$fromJSON(jsonlite::toJSON(this_object$`custom_question_field_type`, auto_unbox = TRUE, digits = NA))
      self$`custom_question_label` <- this_object$`custom_question_label`
      self$`custom_question_options` <- ApiClient$new()$deserializeObj(this_object$`custom_question_options`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadFormQuestion and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadFormQuestion
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`custom_question_options`) > 5) {
        return(FALSE)
      }
      if (length(self$`custom_question_options`) < 0) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (length(self$`custom_question_options`) > 5) {
        invalid_fields["custom_question_options"] <- "Invalid length for `custom_question_options`, number of items must be less than or equal to 5."
      }
      if (length(self$`custom_question_options`) < 0) {
        invalid_fields["custom_question_options"] <- "Invalid length for ``, number of items must be greater than or equal to 0."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# LeadFormQuestion$unlock()
#
## Below is an example to define the print function
# LeadFormQuestion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadFormQuestion$lock()

