#' Create a new UpdateMemberBusinessRoleBody
#'
#' @description
#' Single instance of a business member to have its role updated
#'
#' @docType class
#' @title UpdateMemberBusinessRoleBody
#' @description UpdateMemberBusinessRoleBody Class
#' @format An \code{R6Class} generator object
#' @field business_role  \link{BusinessRoleForMembers}
#' @field member_id Unique identifier of the member character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateMemberBusinessRoleBody <- R6::R6Class(
  "UpdateMemberBusinessRoleBody",
  public = list(
    `business_role` = NULL,
    `member_id` = NULL,

    #' @description
    #' Initialize a new UpdateMemberBusinessRoleBody class.
    #'
    #' @param business_role business_role
    #' @param member_id Unique identifier of the member
    #' @param ... Other optional arguments.
    initialize = function(`business_role`, `member_id`, ...) {
      if (!missing(`business_role`)) {
        if (!(`business_role` %in% c())) {
          stop(paste("Error! \"", `business_role`, "\" cannot be assigned to `business_role`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`business_role`))
        self$`business_role` <- `business_role`
      }
      if (!missing(`member_id`)) {
        if (!(is.character(`member_id`) && length(`member_id`) == 1)) {
          stop(paste("Error! Invalid data for `member_id`. Must be a string:", `member_id`))
        }
        self$`member_id` <- `member_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateMemberBusinessRoleBody in JSON format
    toJSON = function() {
      UpdateMemberBusinessRoleBodyObject <- list()
      if (!is.null(self$`business_role`)) {
        UpdateMemberBusinessRoleBodyObject[["business_role"]] <-
          self$`business_role`$toJSON()
      }
      if (!is.null(self$`member_id`)) {
        UpdateMemberBusinessRoleBodyObject[["member_id"]] <-
          self$`member_id`
      }
      UpdateMemberBusinessRoleBodyObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMemberBusinessRoleBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMemberBusinessRoleBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`business_role`)) {
        `business_role_object` <- BusinessRoleForMembers$new()
        `business_role_object`$fromJSON(jsonlite::toJSON(this_object$`business_role`, auto_unbox = TRUE, digits = NA))
        self$`business_role` <- `business_role_object`
      }
      if (!is.null(this_object$`member_id`)) {
        self$`member_id` <- this_object$`member_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateMemberBusinessRoleBody in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`business_role`)) {
          sprintf(
          '"business_role":
          %s
          ',
          jsonlite::toJSON(self$`business_role`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`member_id`)) {
          sprintf(
          '"member_id":
            "%s"
                    ',
          self$`member_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMemberBusinessRoleBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMemberBusinessRoleBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`business_role` <- BusinessRoleForMembers$new()$fromJSON(jsonlite::toJSON(this_object$`business_role`, auto_unbox = TRUE, digits = NA))
      self$`member_id` <- this_object$`member_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdateMemberBusinessRoleBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `business_role`
      if (!is.null(input_json$`business_role`)) {
        stopifnot(R6::is.R6(input_json$`business_role`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateMemberBusinessRoleBody: the required field `business_role` is missing."))
      }
      # check the required field `member_id`
      if (!is.null(input_json$`member_id`)) {
        if (!(is.character(input_json$`member_id`) && length(input_json$`member_id`) == 1)) {
          stop(paste("Error! Invalid data for `member_id`. Must be a string:", input_json$`member_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateMemberBusinessRoleBody: the required field `member_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateMemberBusinessRoleBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `business_role` is null
      if (is.null(self$`business_role`)) {
        return(FALSE)
      }

      # check if the required `member_id` is null
      if (is.null(self$`member_id`)) {
        return(FALSE)
      }

      if (nchar(self$`member_id`) > 25) {
        return(FALSE)
      }
      if (!str_detect(self$`member_id`, "^\\d+$")) {
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
      # check if the required `business_role` is null
      if (is.null(self$`business_role`)) {
        invalid_fields["business_role"] <- "Non-nullable required field `business_role` cannot be null."
      }

      # check if the required `member_id` is null
      if (is.null(self$`member_id`)) {
        invalid_fields["member_id"] <- "Non-nullable required field `member_id` cannot be null."
      }

      if (nchar(self$`member_id`) > 25) {
        invalid_fields["member_id"] <- "Invalid length for `member_id`, must be smaller than or equal to 25."
      }
      if (!str_detect(self$`member_id`, "^\\d+$")) {
        invalid_fields["member_id"] <- "Invalid value for `member_id`, must conform to the pattern ^\\d+$."
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
# UpdateMemberBusinessRoleBody$unlock()
#
## Below is an example to define the print function
# UpdateMemberBusinessRoleBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateMemberBusinessRoleBody$lock()

