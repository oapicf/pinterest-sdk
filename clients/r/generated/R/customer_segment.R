#' Create a new CustomerSegment
#'
#' @description
#' CustomerSegment Class
#'
#' @docType class
#' @title CustomerSegment
#' @description CustomerSegment Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id The ID of the ad account that this customer segment belongs to. character [optional]
#' @field audience_ids Audience IDs included in the customer segment. list(character)
#' @field created_time Customer segment created time. Unix timestamp in seconds. integer [optional]
#' @field id Customer segment ID. character [optional]
#' @field name Customer segment name. character
#' @field status Indicates whether the customer segment is active or deleted. \link{TargetingTemplateStatus} [optional]
#' @field updated_time Customer segment updated time. Unix timestamp in seconds. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerSegment <- R6::R6Class(
  "CustomerSegment",
  public = list(
    `ad_account_id` = NULL,
    `audience_ids` = NULL,
    `created_time` = NULL,
    `id` = NULL,
    `name` = NULL,
    `status` = NULL,
    `updated_time` = NULL,

    #' @description
    #' Initialize a new CustomerSegment class.
    #'
    #' @param audience_ids Audience IDs included in the customer segment.
    #' @param name Customer segment name.
    #' @param ad_account_id The ID of the ad account that this customer segment belongs to.
    #' @param created_time Customer segment created time. Unix timestamp in seconds.
    #' @param id Customer segment ID.
    #' @param status Indicates whether the customer segment is active or deleted.
    #' @param updated_time Customer segment updated time. Unix timestamp in seconds.
    #' @param ... Other optional arguments.
    initialize = function(`audience_ids`, `name`, `ad_account_id` = NULL, `created_time` = NULL, `id` = NULL, `status` = NULL, `updated_time` = NULL, ...) {
      if (!missing(`audience_ids`)) {
        stopifnot(is.vector(`audience_ids`), length(`audience_ids`) != 0)
        sapply(`audience_ids`, function(x) stopifnot(is.character(x)))
        self$`audience_ids` <- `audience_ids`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CustomerSegment as a base R list.
    #' @examples
    #' # convert array of CustomerSegment (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CustomerSegment to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerSegmentObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        CustomerSegmentObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`audience_ids`)) {
        CustomerSegmentObject[["audience_ids"]] <-
          self$`audience_ids`
      }
      if (!is.null(self$`created_time`)) {
        CustomerSegmentObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`id`)) {
        CustomerSegmentObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        CustomerSegmentObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`status`)) {
        CustomerSegmentObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`updated_time`)) {
        CustomerSegmentObject[["updated_time"]] <-
          self$`updated_time`
      }
      return(CustomerSegmentObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerSegment
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerSegment
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`audience_ids`)) {
        self$`audience_ids` <- ApiClient$new()$deserializeObj(this_object$`audience_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- TargetingTemplateStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerSegment in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerSegment
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerSegment
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`audience_ids` <- ApiClient$new()$deserializeObj(this_object$`audience_ids`, "array[character]", loadNamespace("openapi"))
      self$`created_time` <- this_object$`created_time`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`status` <- TargetingTemplateStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`updated_time` <- this_object$`updated_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerSegment and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `audience_ids`
      if (!is.null(input_json$`audience_ids`)) {
        stopifnot(is.vector(input_json$`audience_ids`), length(input_json$`audience_ids`) != 0)
        tmp <- sapply(input_json$`audience_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerSegment: the required field `audience_ids` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerSegment: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerSegment
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `audience_ids` is null
      if (is.null(self$`audience_ids`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `audience_ids` is null
      if (is.null(self$`audience_ids`)) {
        invalid_fields["audience_ids"] <- "Non-nullable required field `audience_ids` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# CustomerSegment$unlock()
#
## Below is an example to define the print function
# CustomerSegment$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerSegment$lock()

