#' Create a new UpdateMemberResult
#'
#' @description
#' UpdateMemberResult Class
#'
#' @docType class
#' @title UpdateMemberResult
#' @description UpdateMemberResult Class
#' @format An \code{R6Class} generator object
#' @field business_role The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. character [optional]
#' @field member_id Unique identifier of the business member. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateMemberResult <- R6::R6Class(
  "UpdateMemberResult",
  public = list(
    `business_role` = NULL,
    `member_id` = NULL,

    #' @description
    #' Initialize a new UpdateMemberResult class.
    #'
    #' @param business_role The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
    #' @param member_id Unique identifier of the business member.
    #' @param ... Other optional arguments.
    initialize = function(`business_role` = NULL, `member_id` = NULL, ...) {
      if (!is.null(`business_role`)) {
        if (!(is.character(`business_role`) && length(`business_role`) == 1)) {
          stop(paste("Error! Invalid data for `business_role`. Must be a string:", `business_role`))
        }
        self$`business_role` <- `business_role`
      }
      if (!is.null(`member_id`)) {
        if (!(is.character(`member_id`) && length(`member_id`) == 1)) {
          stop(paste("Error! Invalid data for `member_id`. Must be a string:", `member_id`))
        }
        self$`member_id` <- `member_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateMemberResult in JSON format
    toJSON = function() {
      UpdateMemberResultObject <- list()
      if (!is.null(self$`business_role`)) {
        UpdateMemberResultObject[["business_role"]] <-
          self$`business_role`
      }
      if (!is.null(self$`member_id`)) {
        UpdateMemberResultObject[["member_id"]] <-
          self$`member_id`
      }
      UpdateMemberResultObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMemberResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMemberResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`business_role`)) {
        self$`business_role` <- this_object$`business_role`
      }
      if (!is.null(this_object$`member_id`)) {
        self$`member_id` <- this_object$`member_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateMemberResult in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`business_role`)) {
          sprintf(
          '"business_role":
            "%s"
                    ',
          self$`business_role`
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
    #' Deserialize JSON string into an instance of UpdateMemberResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMemberResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`business_role` <- this_object$`business_role`
      self$`member_id` <- this_object$`member_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdateMemberResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateMemberResult
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
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
# UpdateMemberResult$unlock()
#
## Below is an example to define the print function
# UpdateMemberResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateMemberResult$lock()

