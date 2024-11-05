#' Create a new UsersForIndividualAssetResponse
#'
#' @description
#' An object containing the permissions a business member has on the asset.
#'
#' @docType class
#' @title UsersForIndividualAssetResponse
#' @description UsersForIndividualAssetResponse Class
#' @format An \code{R6Class} generator object
#' @field asset_id Unique identifier of a business asset. character [optional]
#' @field member_id Unique identifier of the business member with asset access. character [optional]
#' @field permissions Permission levels member or partner has on an asset. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsersForIndividualAssetResponse <- R6::R6Class(
  "UsersForIndividualAssetResponse",
  public = list(
    `asset_id` = NULL,
    `member_id` = NULL,
    `permissions` = NULL,

    #' @description
    #' Initialize a new UsersForIndividualAssetResponse class.
    #'
    #' @param asset_id Unique identifier of a business asset.
    #' @param member_id Unique identifier of the business member with asset access.
    #' @param permissions Permission levels member or partner has on an asset.
    #' @param ... Other optional arguments.
    initialize = function(`asset_id` = NULL, `member_id` = NULL, `permissions` = NULL, ...) {
      if (!is.null(`asset_id`)) {
        if (!(is.character(`asset_id`) && length(`asset_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_id`. Must be a string:", `asset_id`))
        }
        self$`asset_id` <- `asset_id`
      }
      if (!is.null(`member_id`)) {
        if (!(is.character(`member_id`) && length(`member_id`) == 1)) {
          stop(paste("Error! Invalid data for `member_id`. Must be a string:", `member_id`))
        }
        self$`member_id` <- `member_id`
      }
      if (!is.null(`permissions`)) {
        stopifnot(is.vector(`permissions`), length(`permissions`) != 0)
        sapply(`permissions`, function(x) stopifnot(is.character(x)))
        self$`permissions` <- `permissions`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UsersForIndividualAssetResponse in JSON format
    toJSON = function() {
      UsersForIndividualAssetResponseObject <- list()
      if (!is.null(self$`asset_id`)) {
        UsersForIndividualAssetResponseObject[["asset_id"]] <-
          self$`asset_id`
      }
      if (!is.null(self$`member_id`)) {
        UsersForIndividualAssetResponseObject[["member_id"]] <-
          self$`member_id`
      }
      if (!is.null(self$`permissions`)) {
        UsersForIndividualAssetResponseObject[["permissions"]] <-
          self$`permissions`
      }
      UsersForIndividualAssetResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UsersForIndividualAssetResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsersForIndividualAssetResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_id`)) {
        self$`asset_id` <- this_object$`asset_id`
      }
      if (!is.null(this_object$`member_id`)) {
        self$`member_id` <- this_object$`member_id`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UsersForIndividualAssetResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`asset_id`)) {
          sprintf(
          '"asset_id":
            "%s"
                    ',
          self$`asset_id`
          )
        },
        if (!is.null(self$`member_id`)) {
          sprintf(
          '"member_id":
            "%s"
                    ',
          self$`member_id`
          )
        },
        if (!is.null(self$`permissions`)) {
          sprintf(
          '"permissions":
             [%s]
          ',
          paste(unlist(lapply(self$`permissions`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UsersForIndividualAssetResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsersForIndividualAssetResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_id` <- this_object$`asset_id`
      self$`member_id` <- this_object$`member_id`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to UsersForIndividualAssetResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UsersForIndividualAssetResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`asset_id`, "^\\d+$")) {
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
      if (!str_detect(self$`asset_id`, "^\\d+$")) {
        invalid_fields["asset_id"] <- "Invalid value for `asset_id`, must conform to the pattern ^\\d+$."
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
# UsersForIndividualAssetResponse$unlock()
#
## Below is an example to define the print function
# UsersForIndividualAssetResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UsersForIndividualAssetResponse$lock()

