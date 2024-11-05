#' Create a new CreateAssetAccessRequestBodyAssetRequestsInner
#'
#' @description
#' CreateAssetAccessRequestBodyAssetRequestsInner Class
#'
#' @docType class
#' @title CreateAssetAccessRequestBodyAssetRequestsInner
#' @description CreateAssetAccessRequestBodyAssetRequestsInner Class
#' @format An \code{R6Class} generator object
#' @field partner_id Unique identifier of a business partner to request asset access to. character
#' @field asset_id_to_permissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. named list(list(\link{Permissions}))
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssetAccessRequestBodyAssetRequestsInner <- R6::R6Class(
  "CreateAssetAccessRequestBodyAssetRequestsInner",
  public = list(
    `partner_id` = NULL,
    `asset_id_to_permissions` = NULL,

    #' @description
    #' Initialize a new CreateAssetAccessRequestBodyAssetRequestsInner class.
    #'
    #' @param partner_id Unique identifier of a business partner to request asset access to.
    #' @param asset_id_to_permissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
    #' @param ... Other optional arguments.
    initialize = function(`partner_id`, `asset_id_to_permissions`, ...) {
      if (!missing(`partner_id`)) {
        if (!(is.character(`partner_id`) && length(`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", `partner_id`))
        }
        self$`partner_id` <- `partner_id`
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
    #' @return CreateAssetAccessRequestBodyAssetRequestsInner in JSON format
    toJSON = function() {
      CreateAssetAccessRequestBodyAssetRequestsInnerObject <- list()
      if (!is.null(self$`partner_id`)) {
        CreateAssetAccessRequestBodyAssetRequestsInnerObject[["partner_id"]] <-
          self$`partner_id`
      }
      if (!is.null(self$`asset_id_to_permissions`)) {
        CreateAssetAccessRequestBodyAssetRequestsInnerObject[["asset_id_to_permissions"]] <-
          lapply(self$`asset_id_to_permissions`, function(x) x$toJSON())
      }
      CreateAssetAccessRequestBodyAssetRequestsInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestBodyAssetRequestsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestBodyAssetRequestsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`partner_id`)) {
        self$`partner_id` <- this_object$`partner_id`
      }
      if (!is.null(this_object$`asset_id_to_permissions`)) {
        self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(array[Permissions])", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetAccessRequestBodyAssetRequestsInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`partner_id`)) {
          sprintf(
          '"partner_id":
            "%s"
                    ',
          self$`partner_id`
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
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestBodyAssetRequestsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestBodyAssetRequestsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`partner_id` <- this_object$`partner_id`
      self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(array[Permissions])", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssetAccessRequestBodyAssetRequestsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `partner_id`
      if (!is.null(input_json$`partner_id`)) {
        if (!(is.character(input_json$`partner_id`) && length(input_json$`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", input_json$`partner_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetAccessRequestBodyAssetRequestsInner: the required field `partner_id` is missing."))
      }
      # check the required field `asset_id_to_permissions`
      if (!is.null(input_json$`asset_id_to_permissions`)) {
        stopifnot(is.vector(input_json$`asset_id_to_permissions`), length(input_json$`asset_id_to_permissions`) != 0)
        tmp <- sapply(input_json$`asset_id_to_permissions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetAccessRequestBodyAssetRequestsInner: the required field `asset_id_to_permissions` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssetAccessRequestBodyAssetRequestsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `partner_id` is null
      if (is.null(self$`partner_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`partner_id`, "^\\d+$")) {
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
      # check if the required `partner_id` is null
      if (is.null(self$`partner_id`)) {
        invalid_fields["partner_id"] <- "Non-nullable required field `partner_id` cannot be null."
      }

      if (!str_detect(self$`partner_id`, "^\\d+$")) {
        invalid_fields["partner_id"] <- "Invalid value for `partner_id`, must conform to the pattern ^\\d+$."
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
# CreateAssetAccessRequestBodyAssetRequestsInner$unlock()
#
## Below is an example to define the print function
# CreateAssetAccessRequestBodyAssetRequestsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssetAccessRequestBodyAssetRequestsInner$lock()

