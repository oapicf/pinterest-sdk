#' Create a new CreateMembershipOrPartnershipInvitesBody
#'
#' @description
#' Body to be used on path to send Members or Partners Invite or Request
#'
#' @docType class
#' @title CreateMembershipOrPartnershipInvitesBody
#' @description CreateMembershipOrPartnershipInvitesBody Class
#' @format An \code{R6Class} generator object
#' @field business_role  \link{BusinessRoleForInvite}
#' @field invite_type  \link{InviteType}
#' @field members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE list(character) [optional]
#' @field partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateMembershipOrPartnershipInvitesBody <- R6::R6Class(
  "CreateMembershipOrPartnershipInvitesBody",
  public = list(
    `business_role` = NULL,
    `invite_type` = NULL,
    `members` = NULL,
    `partners` = NULL,

    #' @description
    #' Initialize a new CreateMembershipOrPartnershipInvitesBody class.
    #'
    #' @param business_role business_role
    #' @param invite_type invite_type
    #' @param members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
    #' @param partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
    #' @param ... Other optional arguments.
    initialize = function(`business_role`, `invite_type`, `members` = NULL, `partners` = NULL, ...) {
      if (!missing(`business_role`)) {
        if (!(`business_role` %in% c())) {
          stop(paste("Error! \"", `business_role`, "\" cannot be assigned to `business_role`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`business_role`))
        self$`business_role` <- `business_role`
      }
      if (!missing(`invite_type`)) {
        if (!(`invite_type` %in% c())) {
          stop(paste("Error! \"", `invite_type`, "\" cannot be assigned to `invite_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`invite_type`))
        self$`invite_type` <- `invite_type`
      }
      if (!is.null(`members`)) {
        stopifnot(is.vector(`members`), length(`members`) != 0)
        sapply(`members`, function(x) stopifnot(is.character(x)))
        self$`members` <- `members`
      }
      if (!is.null(`partners`)) {
        stopifnot(is.vector(`partners`), length(`partners`) != 0)
        sapply(`partners`, function(x) stopifnot(is.character(x)))
        self$`partners` <- `partners`
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
    #' @return CreateMembershipOrPartnershipInvitesBody as a base R list.
    #' @examples
    #' # convert array of CreateMembershipOrPartnershipInvitesBody (x) to a data frame
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
    #' Convert CreateMembershipOrPartnershipInvitesBody to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateMembershipOrPartnershipInvitesBodyObject <- list()
      if (!is.null(self$`business_role`)) {
        CreateMembershipOrPartnershipInvitesBodyObject[["business_role"]] <-
          self$extractSimpleType(self$`business_role`)
      }
      if (!is.null(self$`invite_type`)) {
        CreateMembershipOrPartnershipInvitesBodyObject[["invite_type"]] <-
          self$extractSimpleType(self$`invite_type`)
      }
      if (!is.null(self$`members`)) {
        CreateMembershipOrPartnershipInvitesBodyObject[["members"]] <-
          self$`members`
      }
      if (!is.null(self$`partners`)) {
        CreateMembershipOrPartnershipInvitesBodyObject[["partners"]] <-
          self$`partners`
      }
      return(CreateMembershipOrPartnershipInvitesBodyObject)
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
    #' Deserialize JSON string into an instance of CreateMembershipOrPartnershipInvitesBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMembershipOrPartnershipInvitesBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`business_role`)) {
        `business_role_object` <- BusinessRoleForInvite$new()
        `business_role_object`$fromJSON(jsonlite::toJSON(this_object$`business_role`, auto_unbox = TRUE, digits = NA))
        self$`business_role` <- `business_role_object`
      }
      if (!is.null(this_object$`invite_type`)) {
        `invite_type_object` <- InviteType$new()
        `invite_type_object`$fromJSON(jsonlite::toJSON(this_object$`invite_type`, auto_unbox = TRUE, digits = NA))
        self$`invite_type` <- `invite_type_object`
      }
      if (!is.null(this_object$`members`)) {
        self$`members` <- ApiClient$new()$deserializeObj(this_object$`members`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`partners`)) {
        self$`partners` <- ApiClient$new()$deserializeObj(this_object$`partners`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateMembershipOrPartnershipInvitesBody in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateMembershipOrPartnershipInvitesBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMembershipOrPartnershipInvitesBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`business_role` <- BusinessRoleForInvite$new()$fromJSON(jsonlite::toJSON(this_object$`business_role`, auto_unbox = TRUE, digits = NA))
      self$`invite_type` <- InviteType$new()$fromJSON(jsonlite::toJSON(this_object$`invite_type`, auto_unbox = TRUE, digits = NA))
      self$`members` <- ApiClient$new()$deserializeObj(this_object$`members`, "array[character]", loadNamespace("openapi"))
      self$`partners` <- ApiClient$new()$deserializeObj(this_object$`partners`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateMembershipOrPartnershipInvitesBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `business_role`
      if (!is.null(input_json$`business_role`)) {
        stopifnot(R6::is.R6(input_json$`business_role`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateMembershipOrPartnershipInvitesBody: the required field `business_role` is missing."))
      }
      # check the required field `invite_type`
      if (!is.null(input_json$`invite_type`)) {
        stopifnot(R6::is.R6(input_json$`invite_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateMembershipOrPartnershipInvitesBody: the required field `invite_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateMembershipOrPartnershipInvitesBody
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

      # check if the required `invite_type` is null
      if (is.null(self$`invite_type`)) {
        return(FALSE)
      }

      if (length(self$`members`) > 50) {
        return(FALSE)
      }
      if (length(self$`members`) < 1) {
        return(FALSE)
      }

      if (length(self$`partners`) > 50) {
        return(FALSE)
      }
      if (length(self$`partners`) < 1) {
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

      # check if the required `invite_type` is null
      if (is.null(self$`invite_type`)) {
        invalid_fields["invite_type"] <- "Non-nullable required field `invite_type` cannot be null."
      }

      if (length(self$`members`) > 50) {
        invalid_fields["members"] <- "Invalid length for `members`, number of items must be less than or equal to 50."
      }
      if (length(self$`members`) < 1) {
        invalid_fields["members"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`partners`) > 50) {
        invalid_fields["partners"] <- "Invalid length for `partners`, number of items must be less than or equal to 50."
      }
      if (length(self$`partners`) < 1) {
        invalid_fields["partners"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CreateMembershipOrPartnershipInvitesBody$unlock()
#
## Below is an example to define the print function
# CreateMembershipOrPartnershipInvitesBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateMembershipOrPartnershipInvitesBody$lock()

