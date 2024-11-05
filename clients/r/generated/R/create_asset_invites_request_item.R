#' Create a new CreateAssetInvitesRequestItem
#'
#' @description
#' Object declaring an asset role update to an invite.
#'
#' @docType class
#' @title CreateAssetInvitesRequestItem
#' @description CreateAssetInvitesRequestItem Class
#' @format An \code{R6Class} generator object
#' @field invite_id Unique identifier of an invite. character
#' @field invite_type  \link{InviteType}
#' @field asset_id_to_permissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. named list(list(\link{Permissions}))
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssetInvitesRequestItem <- R6::R6Class(
  "CreateAssetInvitesRequestItem",
  public = list(
    `invite_id` = NULL,
    `invite_type` = NULL,
    `asset_id_to_permissions` = NULL,

    #' @description
    #' Initialize a new CreateAssetInvitesRequestItem class.
    #'
    #' @param invite_id Unique identifier of an invite.
    #' @param invite_type invite_type
    #' @param asset_id_to_permissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
    #' @param ... Other optional arguments.
    initialize = function(`invite_id`, `invite_type`, `asset_id_to_permissions`, ...) {
      if (!missing(`invite_id`)) {
        if (!(is.character(`invite_id`) && length(`invite_id`) == 1)) {
          stop(paste("Error! Invalid data for `invite_id`. Must be a string:", `invite_id`))
        }
        self$`invite_id` <- `invite_id`
      }
      if (!missing(`invite_type`)) {
        if (!(`invite_type` %in% c())) {
          stop(paste("Error! \"", `invite_type`, "\" cannot be assigned to `invite_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`invite_type`))
        self$`invite_type` <- `invite_type`
      }
      if (!missing(`asset_id_to_permissions`)) {
        stopifnot(is.vector(`asset_id_to_permissions`), length(`asset_id_to_permissions`) != 0)
        sapply(`asset_id_to_permissions`, function(x) stopifnot(R6::is.R6(x)))
        self$`asset_id_to_permissions` <- `asset_id_to_permissions`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetInvitesRequestItem in JSON format
    toJSON = function() {
      CreateAssetInvitesRequestItemObject <- list()
      if (!is.null(self$`invite_id`)) {
        CreateAssetInvitesRequestItemObject[["invite_id"]] <-
          self$`invite_id`
      }
      if (!is.null(self$`invite_type`)) {
        CreateAssetInvitesRequestItemObject[["invite_type"]] <-
          self$`invite_type`$toJSON()
      }
      if (!is.null(self$`asset_id_to_permissions`)) {
        CreateAssetInvitesRequestItemObject[["asset_id_to_permissions"]] <-
          lapply(self$`asset_id_to_permissions`, function(x) x$toJSON())
      }
      CreateAssetInvitesRequestItemObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetInvitesRequestItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetInvitesRequestItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`invite_id`)) {
        self$`invite_id` <- this_object$`invite_id`
      }
      if (!is.null(this_object$`invite_type`)) {
        `invite_type_object` <- InviteType$new()
        `invite_type_object`$fromJSON(jsonlite::toJSON(this_object$`invite_type`, auto_unbox = TRUE, digits = NA))
        self$`invite_type` <- `invite_type_object`
      }
      if (!is.null(this_object$`asset_id_to_permissions`)) {
        self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(array[Permissions])", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetInvitesRequestItem in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`invite_id`)) {
          sprintf(
          '"invite_id":
            "%s"
                    ',
          self$`invite_id`
          )
        },
        if (!is.null(self$`invite_type`)) {
          sprintf(
          '"invite_type":
          %s
          ',
          jsonlite::toJSON(self$`invite_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`asset_id_to_permissions`)) {
          sprintf(
          '"asset_id_to_permissions":
          %s
',
          jsonlite::toJSON(lapply(self$`asset_id_to_permissions`, function(x){ x$toJSON() }), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetInvitesRequestItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetInvitesRequestItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`invite_id` <- this_object$`invite_id`
      self$`invite_type` <- InviteType$new()$fromJSON(jsonlite::toJSON(this_object$`invite_type`, auto_unbox = TRUE, digits = NA))
      self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(array[Permissions])", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssetInvitesRequestItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `invite_id`
      if (!is.null(input_json$`invite_id`)) {
        if (!(is.character(input_json$`invite_id`) && length(input_json$`invite_id`) == 1)) {
          stop(paste("Error! Invalid data for `invite_id`. Must be a string:", input_json$`invite_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetInvitesRequestItem: the required field `invite_id` is missing."))
      }
      # check the required field `invite_type`
      if (!is.null(input_json$`invite_type`)) {
        stopifnot(R6::is.R6(input_json$`invite_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetInvitesRequestItem: the required field `invite_type` is missing."))
      }
      # check the required field `asset_id_to_permissions`
      if (!is.null(input_json$`asset_id_to_permissions`)) {
        stopifnot(is.vector(input_json$`asset_id_to_permissions`), length(input_json$`asset_id_to_permissions`) != 0)
        tmp <- sapply(input_json$`asset_id_to_permissions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetInvitesRequestItem: the required field `asset_id_to_permissions` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssetInvitesRequestItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `invite_id` is null
      if (is.null(self$`invite_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`invite_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `invite_type` is null
      if (is.null(self$`invite_type`)) {
        return(FALSE)
      }

      # check if the required `asset_id_to_permissions` is null
      if (is.null(self$`asset_id_to_permissions`)) {
        return(FALSE)
      }

      if (length(self$`asset_id_to_permissions`) < 1) {
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
      # check if the required `invite_id` is null
      if (is.null(self$`invite_id`)) {
        invalid_fields["invite_id"] <- "Non-nullable required field `invite_id` cannot be null."
      }

      if (!str_detect(self$`invite_id`, "^\\d+$")) {
        invalid_fields["invite_id"] <- "Invalid value for `invite_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `invite_type` is null
      if (is.null(self$`invite_type`)) {
        invalid_fields["invite_type"] <- "Non-nullable required field `invite_type` cannot be null."
      }

      # check if the required `asset_id_to_permissions` is null
      if (is.null(self$`asset_id_to_permissions`)) {
        invalid_fields["asset_id_to_permissions"] <- "Non-nullable required field `asset_id_to_permissions` cannot be null."
      }

      if (length(self$`asset_id_to_permissions`) < 1) {
        invalid_fields["asset_id_to_permissions"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CreateAssetInvitesRequestItem$unlock()
#
## Below is an example to define the print function
# CreateAssetInvitesRequestItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssetInvitesRequestItem$lock()

