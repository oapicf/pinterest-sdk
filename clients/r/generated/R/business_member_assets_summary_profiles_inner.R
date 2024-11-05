#' Create a new BusinessMemberAssetsSummaryProfilesInner
#'
#' @description
#' BusinessMemberAssetsSummaryProfilesInner Class
#'
#' @docType class
#' @title BusinessMemberAssetsSummaryProfilesInner
#' @description BusinessMemberAssetsSummaryProfilesInner Class
#' @format An \code{R6Class} generator object
#' @field id Unique identifier of a business profile. character [optional]
#' @field permissions Permission levels member or partner has on an asset. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessMemberAssetsSummaryProfilesInner <- R6::R6Class(
  "BusinessMemberAssetsSummaryProfilesInner",
  public = list(
    `id` = NULL,
    `permissions` = NULL,

    #' @description
    #' Initialize a new BusinessMemberAssetsSummaryProfilesInner class.
    #'
    #' @param id Unique identifier of a business profile.
    #' @param permissions Permission levels member or partner has on an asset.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `permissions` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
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
    #' @return BusinessMemberAssetsSummaryProfilesInner in JSON format
    toJSON = function() {
      BusinessMemberAssetsSummaryProfilesInnerObject <- list()
      if (!is.null(self$`id`)) {
        BusinessMemberAssetsSummaryProfilesInnerObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`permissions`)) {
        BusinessMemberAssetsSummaryProfilesInnerObject[["permissions"]] <-
          self$`permissions`
      }
      BusinessMemberAssetsSummaryProfilesInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessMemberAssetsSummaryProfilesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessMemberAssetsSummaryProfilesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BusinessMemberAssetsSummaryProfilesInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
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
    #' Deserialize JSON string into an instance of BusinessMemberAssetsSummaryProfilesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessMemberAssetsSummaryProfilesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BusinessMemberAssetsSummaryProfilesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BusinessMemberAssetsSummaryProfilesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`id`) > 20) {
        return(FALSE)
      }
      if (nchar(self$`id`) < 1) {
        return(FALSE)
      }
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
      if (nchar(self$`id`) > 20) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 20."
      }
      if (nchar(self$`id`) < 1) {
        invalid_fields["id"] <- "Invalid length for `id`, must be bigger than or equal to 1."
      }
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
# BusinessMemberAssetsSummaryProfilesInner$unlock()
#
## Below is an example to define the print function
# BusinessMemberAssetsSummaryProfilesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BusinessMemberAssetsSummaryProfilesInner$lock()

