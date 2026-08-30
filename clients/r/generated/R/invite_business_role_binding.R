#' Create a new InviteBusinessRoleBinding
#'
#' @description
#' An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
#'
#' @docType class
#' @title InviteBusinessRoleBinding
#' @description InviteBusinessRoleBinding Class
#' @format An \code{R6Class} generator object
#' @field created_by_business_id Unique identifier for the business that created the invite/request. character [optional]
#' @field created_by_user_id Unique identifier for the user that created the invite/request. character [optional]
#' @field id Unique identifier of the invite/request. character [optional]
#' @field invite_data  \link{InviteDataResponse} [optional]
#' @field is_received_invite Indicates whether the invite/request was received. character [optional]
#' @field user Metadata for the member/partner that was sent the invite/request. \link{BusinessAccessUserSummary} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteBusinessRoleBinding <- R6::R6Class(
  "InviteBusinessRoleBinding",
  public = list(
    `created_by_business_id` = NULL,
    `created_by_user_id` = NULL,
    `id` = NULL,
    `invite_data` = NULL,
    `is_received_invite` = NULL,
    `user` = NULL,

    #' @description
    #' Initialize a new InviteBusinessRoleBinding class.
    #'
    #' @param created_by_business_id Unique identifier for the business that created the invite/request.
    #' @param created_by_user_id Unique identifier for the user that created the invite/request.
    #' @param id Unique identifier of the invite/request.
    #' @param invite_data invite_data
    #' @param is_received_invite Indicates whether the invite/request was received.
    #' @param user Metadata for the member/partner that was sent the invite/request.
    #' @param ... Other optional arguments.
    initialize = function(`created_by_business_id` = NULL, `created_by_user_id` = NULL, `id` = NULL, `invite_data` = NULL, `is_received_invite` = NULL, `user` = NULL, ...) {
      if (!is.null(`created_by_business_id`)) {
        if (!(is.character(`created_by_business_id`) && length(`created_by_business_id`) == 1)) {
          stop(paste("Error! Invalid data for `created_by_business_id`. Must be a string:", `created_by_business_id`))
        }
        self$`created_by_business_id` <- `created_by_business_id`
      }
      if (!is.null(`created_by_user_id`)) {
        if (!(is.character(`created_by_user_id`) && length(`created_by_user_id`) == 1)) {
          stop(paste("Error! Invalid data for `created_by_user_id`. Must be a string:", `created_by_user_id`))
        }
        self$`created_by_user_id` <- `created_by_user_id`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`invite_data`)) {
        stopifnot(R6::is.R6(`invite_data`))
        self$`invite_data` <- `invite_data`
      }
      if (!is.null(`is_received_invite`)) {
        if (!(is.logical(`is_received_invite`) && length(`is_received_invite`) == 1)) {
          stop(paste("Error! Invalid data for `is_received_invite`. Must be a boolean:", `is_received_invite`))
        }
        self$`is_received_invite` <- `is_received_invite`
      }
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
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
    #' @return InviteBusinessRoleBinding as a base R list.
    #' @examples
    #' # convert array of InviteBusinessRoleBinding (x) to a data frame
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
    #' Convert InviteBusinessRoleBinding to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InviteBusinessRoleBindingObject <- list()
      if (!is.null(self$`created_by_business_id`)) {
        InviteBusinessRoleBindingObject[["created_by_business_id"]] <-
          self$`created_by_business_id`
      }
      if (!is.null(self$`created_by_user_id`)) {
        InviteBusinessRoleBindingObject[["created_by_user_id"]] <-
          self$`created_by_user_id`
      }
      if (!is.null(self$`id`)) {
        InviteBusinessRoleBindingObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`invite_data`)) {
        InviteBusinessRoleBindingObject[["invite_data"]] <-
          self$extractSimpleType(self$`invite_data`)
      }
      if (!is.null(self$`is_received_invite`)) {
        InviteBusinessRoleBindingObject[["is_received_invite"]] <-
          self$`is_received_invite`
      }
      if (!is.null(self$`user`)) {
        InviteBusinessRoleBindingObject[["user"]] <-
          self$extractSimpleType(self$`user`)
      }
      return(InviteBusinessRoleBindingObject)
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
    #' Deserialize JSON string into an instance of InviteBusinessRoleBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteBusinessRoleBinding
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`created_by_business_id`)) {
        self$`created_by_business_id` <- this_object$`created_by_business_id`
      }
      if (!is.null(this_object$`created_by_user_id`)) {
        self$`created_by_user_id` <- this_object$`created_by_user_id`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`invite_data`)) {
        `invite_data_object` <- InviteDataResponse$new()
        `invite_data_object`$fromJSON(jsonlite::toJSON(this_object$`invite_data`, auto_unbox = TRUE, digits = NA))
        self$`invite_data` <- `invite_data_object`
      }
      if (!is.null(this_object$`is_received_invite`)) {
        self$`is_received_invite` <- this_object$`is_received_invite`
      }
      if (!is.null(this_object$`user`)) {
        `user_object` <- BusinessAccessUserSummary$new()
        `user_object`$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
        self$`user` <- `user_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return InviteBusinessRoleBinding in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteBusinessRoleBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteBusinessRoleBinding
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`created_by_business_id` <- this_object$`created_by_business_id`
      self$`created_by_user_id` <- this_object$`created_by_user_id`
      self$`id` <- this_object$`id`
      self$`invite_data` <- InviteDataResponse$new()$fromJSON(jsonlite::toJSON(this_object$`invite_data`, auto_unbox = TRUE, digits = NA))
      self$`is_received_invite` <- this_object$`is_received_invite`
      self$`user` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteBusinessRoleBinding and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteBusinessRoleBinding
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# InviteBusinessRoleBinding$unlock()
#
## Below is an example to define the print function
# InviteBusinessRoleBinding$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteBusinessRoleBinding$lock()

