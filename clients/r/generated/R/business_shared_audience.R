#' Create a new BusinessSharedAudience
#'
#' @description
#' BusinessSharedAudience Class
#'
#' @docType class
#' @title BusinessSharedAudience
#' @description BusinessSharedAudience Class
#' @format An \code{R6Class} generator object
#' @field audience_id Unique identifier of an audience character
#' @field operation_type  \link{OperationType}
#' @field recipient_business_ids List of business IDs to share with or revoke from. list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessSharedAudience <- R6::R6Class(
  "BusinessSharedAudience",
  public = list(
    `audience_id` = NULL,
    `operation_type` = NULL,
    `recipient_business_ids` = NULL,

    #' @description
    #' Initialize a new BusinessSharedAudience class.
    #'
    #' @param audience_id Unique identifier of an audience
    #' @param operation_type operation_type
    #' @param recipient_business_ids List of business IDs to share with or revoke from.
    #' @param ... Other optional arguments.
    initialize = function(`audience_id`, `operation_type`, `recipient_business_ids`, ...) {
      if (!missing(`audience_id`)) {
        if (!(is.character(`audience_id`) && length(`audience_id`) == 1)) {
          stop(paste("Error! Invalid data for `audience_id`. Must be a string:", `audience_id`))
        }
        self$`audience_id` <- `audience_id`
      }
      if (!missing(`operation_type`)) {
        if (!(`operation_type` %in% c())) {
          stop(paste("Error! \"", `operation_type`, "\" cannot be assigned to `operation_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation_type`))
        self$`operation_type` <- `operation_type`
      }
      if (!missing(`recipient_business_ids`)) {
        stopifnot(is.vector(`recipient_business_ids`), length(`recipient_business_ids`) != 0)
        sapply(`recipient_business_ids`, function(x) stopifnot(is.character(x)))
        self$`recipient_business_ids` <- `recipient_business_ids`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BusinessSharedAudience in JSON format
    toJSON = function() {
      BusinessSharedAudienceObject <- list()
      if (!is.null(self$`audience_id`)) {
        BusinessSharedAudienceObject[["audience_id"]] <-
          self$`audience_id`
      }
      if (!is.null(self$`operation_type`)) {
        BusinessSharedAudienceObject[["operation_type"]] <-
          self$`operation_type`$toJSON()
      }
      if (!is.null(self$`recipient_business_ids`)) {
        BusinessSharedAudienceObject[["recipient_business_ids"]] <-
          self$`recipient_business_ids`
      }
      BusinessSharedAudienceObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessSharedAudience
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessSharedAudience
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_id`)) {
        self$`audience_id` <- this_object$`audience_id`
      }
      if (!is.null(this_object$`operation_type`)) {
        `operation_type_object` <- OperationType$new()
        `operation_type_object`$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
        self$`operation_type` <- `operation_type_object`
      }
      if (!is.null(this_object$`recipient_business_ids`)) {
        self$`recipient_business_ids` <- ApiClient$new()$deserializeObj(this_object$`recipient_business_ids`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BusinessSharedAudience in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`audience_id`)) {
          sprintf(
          '"audience_id":
            "%s"
                    ',
          self$`audience_id`
          )
        },
        if (!is.null(self$`operation_type`)) {
          sprintf(
          '"operation_type":
          %s
          ',
          jsonlite::toJSON(self$`operation_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`recipient_business_ids`)) {
          sprintf(
          '"recipient_business_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`recipient_business_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessSharedAudience
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessSharedAudience
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_id` <- this_object$`audience_id`
      self$`operation_type` <- OperationType$new()$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
      self$`recipient_business_ids` <- ApiClient$new()$deserializeObj(this_object$`recipient_business_ids`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BusinessSharedAudience and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `audience_id`
      if (!is.null(input_json$`audience_id`)) {
        if (!(is.character(input_json$`audience_id`) && length(input_json$`audience_id`) == 1)) {
          stop(paste("Error! Invalid data for `audience_id`. Must be a string:", input_json$`audience_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BusinessSharedAudience: the required field `audience_id` is missing."))
      }
      # check the required field `operation_type`
      if (!is.null(input_json$`operation_type`)) {
        stopifnot(R6::is.R6(input_json$`operation_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BusinessSharedAudience: the required field `operation_type` is missing."))
      }
      # check the required field `recipient_business_ids`
      if (!is.null(input_json$`recipient_business_ids`)) {
        stopifnot(is.vector(input_json$`recipient_business_ids`), length(input_json$`recipient_business_ids`) != 0)
        tmp <- sapply(input_json$`recipient_business_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BusinessSharedAudience: the required field `recipient_business_ids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BusinessSharedAudience
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `audience_id` is null
      if (is.null(self$`audience_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`audience_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `operation_type` is null
      if (is.null(self$`operation_type`)) {
        return(FALSE)
      }

      # check if the required `recipient_business_ids` is null
      if (is.null(self$`recipient_business_ids`)) {
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
      # check if the required `audience_id` is null
      if (is.null(self$`audience_id`)) {
        invalid_fields["audience_id"] <- "Non-nullable required field `audience_id` cannot be null."
      }

      if (!str_detect(self$`audience_id`, "^\\d+$")) {
        invalid_fields["audience_id"] <- "Invalid value for `audience_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `operation_type` is null
      if (is.null(self$`operation_type`)) {
        invalid_fields["operation_type"] <- "Non-nullable required field `operation_type` cannot be null."
      }

      # check if the required `recipient_business_ids` is null
      if (is.null(self$`recipient_business_ids`)) {
        invalid_fields["recipient_business_ids"] <- "Non-nullable required field `recipient_business_ids` cannot be null."
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
# BusinessSharedAudience$unlock()
#
## Below is an example to define the print function
# BusinessSharedAudience$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BusinessSharedAudience$lock()

