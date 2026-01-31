#' Create a new ConversionEventAppInfo
#'
#' @description
#' Object containing information about the application where event occurred.
#'
#' @docType class
#' @title ConversionEventAppInfo
#' @description ConversionEventAppInfo Class
#' @format An \code{R6Class} generator object
#' @field app_id App ID in Google Play Store, AppStore or other stores. character [optional]
#' @field app_name Name of the app. Primarily used for Mobile Apps. character [optional]
#' @field app_package_name App package name character [optional]
#' @field app_store The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps character [optional]
#' @field app_version App version. Primarily used for mobile apps character [optional]
#' @field install_time App install time. Unix timestamp in seconds integer [optional]
#' @field user_agent User Agent request header. Primarily used for Web events character [optional]
#' @field window_height Inner height of the window or viewport. integer [optional]
#' @field window_width Inner width of the window or viewport. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventAppInfo <- R6::R6Class(
  "ConversionEventAppInfo",
  public = list(
    `app_id` = NULL,
    `app_name` = NULL,
    `app_package_name` = NULL,
    `app_store` = NULL,
    `app_version` = NULL,
    `install_time` = NULL,
    `user_agent` = NULL,
    `window_height` = NULL,
    `window_width` = NULL,

    #' @description
    #' Initialize a new ConversionEventAppInfo class.
    #'
    #' @param app_id App ID in Google Play Store, AppStore or other stores.
    #' @param app_name Name of the app. Primarily used for Mobile Apps.
    #' @param app_package_name App package name
    #' @param app_store The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
    #' @param app_version App version. Primarily used for mobile apps
    #' @param install_time App install time. Unix timestamp in seconds
    #' @param user_agent User Agent request header. Primarily used for Web events
    #' @param window_height Inner height of the window or viewport.
    #' @param window_width Inner width of the window or viewport.
    #' @param ... Other optional arguments.
    initialize = function(`app_id` = NULL, `app_name` = NULL, `app_package_name` = NULL, `app_store` = NULL, `app_version` = NULL, `install_time` = NULL, `user_agent` = NULL, `window_height` = NULL, `window_width` = NULL, ...) {
      if (!is.null(`app_id`)) {
        if (!(is.character(`app_id`) && length(`app_id`) == 1)) {
          stop(paste("Error! Invalid data for `app_id`. Must be a string:", `app_id`))
        }
        self$`app_id` <- `app_id`
      }
      if (!is.null(`app_name`)) {
        if (!(is.character(`app_name`) && length(`app_name`) == 1)) {
          stop(paste("Error! Invalid data for `app_name`. Must be a string:", `app_name`))
        }
        self$`app_name` <- `app_name`
      }
      if (!is.null(`app_package_name`)) {
        if (!(is.character(`app_package_name`) && length(`app_package_name`) == 1)) {
          stop(paste("Error! Invalid data for `app_package_name`. Must be a string:", `app_package_name`))
        }
        self$`app_package_name` <- `app_package_name`
      }
      if (!is.null(`app_store`)) {
        if (!(is.character(`app_store`) && length(`app_store`) == 1)) {
          stop(paste("Error! Invalid data for `app_store`. Must be a string:", `app_store`))
        }
        self$`app_store` <- `app_store`
      }
      if (!is.null(`app_version`)) {
        if (!(is.character(`app_version`) && length(`app_version`) == 1)) {
          stop(paste("Error! Invalid data for `app_version`. Must be a string:", `app_version`))
        }
        self$`app_version` <- `app_version`
      }
      if (!is.null(`install_time`)) {
        if (!(is.numeric(`install_time`) && length(`install_time`) == 1)) {
          stop(paste("Error! Invalid data for `install_time`. Must be an integer:", `install_time`))
        }
        self$`install_time` <- `install_time`
      }
      if (!is.null(`user_agent`)) {
        if (!(is.character(`user_agent`) && length(`user_agent`) == 1)) {
          stop(paste("Error! Invalid data for `user_agent`. Must be a string:", `user_agent`))
        }
        self$`user_agent` <- `user_agent`
      }
      if (!is.null(`window_height`)) {
        if (!(is.numeric(`window_height`) && length(`window_height`) == 1)) {
          stop(paste("Error! Invalid data for `window_height`. Must be an integer:", `window_height`))
        }
        self$`window_height` <- `window_height`
      }
      if (!is.null(`window_width`)) {
        if (!(is.numeric(`window_width`) && length(`window_width`) == 1)) {
          stop(paste("Error! Invalid data for `window_width`. Must be an integer:", `window_width`))
        }
        self$`window_width` <- `window_width`
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
    #' @return ConversionEventAppInfo as a base R list.
    #' @examples
    #' # convert array of ConversionEventAppInfo (x) to a data frame
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
    #' Convert ConversionEventAppInfo to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionEventAppInfoObject <- list()
      if (!is.null(self$`app_id`)) {
        ConversionEventAppInfoObject[["app_id"]] <-
          self$`app_id`
      }
      if (!is.null(self$`app_name`)) {
        ConversionEventAppInfoObject[["app_name"]] <-
          self$`app_name`
      }
      if (!is.null(self$`app_package_name`)) {
        ConversionEventAppInfoObject[["app_package_name"]] <-
          self$`app_package_name`
      }
      if (!is.null(self$`app_store`)) {
        ConversionEventAppInfoObject[["app_store"]] <-
          self$`app_store`
      }
      if (!is.null(self$`app_version`)) {
        ConversionEventAppInfoObject[["app_version"]] <-
          self$`app_version`
      }
      if (!is.null(self$`install_time`)) {
        ConversionEventAppInfoObject[["install_time"]] <-
          self$`install_time`
      }
      if (!is.null(self$`user_agent`)) {
        ConversionEventAppInfoObject[["user_agent"]] <-
          self$`user_agent`
      }
      if (!is.null(self$`window_height`)) {
        ConversionEventAppInfoObject[["window_height"]] <-
          self$`window_height`
      }
      if (!is.null(self$`window_width`)) {
        ConversionEventAppInfoObject[["window_width"]] <-
          self$`window_width`
      }
      return(ConversionEventAppInfoObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventAppInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventAppInfo
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`app_id`)) {
        self$`app_id` <- this_object$`app_id`
      }
      if (!is.null(this_object$`app_name`)) {
        self$`app_name` <- this_object$`app_name`
      }
      if (!is.null(this_object$`app_package_name`)) {
        self$`app_package_name` <- this_object$`app_package_name`
      }
      if (!is.null(this_object$`app_store`)) {
        self$`app_store` <- this_object$`app_store`
      }
      if (!is.null(this_object$`app_version`)) {
        self$`app_version` <- this_object$`app_version`
      }
      if (!is.null(this_object$`install_time`)) {
        self$`install_time` <- this_object$`install_time`
      }
      if (!is.null(this_object$`user_agent`)) {
        self$`user_agent` <- this_object$`user_agent`
      }
      if (!is.null(this_object$`window_height`)) {
        self$`window_height` <- this_object$`window_height`
      }
      if (!is.null(this_object$`window_width`)) {
        self$`window_width` <- this_object$`window_width`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionEventAppInfo in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventAppInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventAppInfo
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`app_id` <- this_object$`app_id`
      self$`app_name` <- this_object$`app_name`
      self$`app_package_name` <- this_object$`app_package_name`
      self$`app_store` <- this_object$`app_store`
      self$`app_version` <- this_object$`app_version`
      self$`install_time` <- this_object$`install_time`
      self$`user_agent` <- this_object$`user_agent`
      self$`window_height` <- this_object$`window_height`
      self$`window_width` <- this_object$`window_width`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventAppInfo and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventAppInfo
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`app_id`) > 200) {
        return(FALSE)
      }

      if (nchar(self$`app_name`) > 200) {
        return(FALSE)
      }

      if (nchar(self$`app_package_name`) > 200) {
        return(FALSE)
      }

      if (nchar(self$`app_store`) > 100) {
        return(FALSE)
      }

      if (nchar(self$`app_version`) > 100) {
        return(FALSE)
      }

      if (self$`install_time` < 0) {
        return(FALSE)
      }

      if (nchar(self$`user_agent`) > 16384) {
        return(FALSE)
      }

      if (self$`window_height` > 30720) {
        return(FALSE)
      }
      if (self$`window_height` < 0) {
        return(FALSE)
      }

      if (self$`window_width` > 30720) {
        return(FALSE)
      }
      if (self$`window_width` < 0) {
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
      if (nchar(self$`app_id`) > 200) {
        invalid_fields["app_id"] <- "Invalid length for `app_id`, must be smaller than or equal to 200."
      }

      if (nchar(self$`app_name`) > 200) {
        invalid_fields["app_name"] <- "Invalid length for `app_name`, must be smaller than or equal to 200."
      }

      if (nchar(self$`app_package_name`) > 200) {
        invalid_fields["app_package_name"] <- "Invalid length for `app_package_name`, must be smaller than or equal to 200."
      }

      if (nchar(self$`app_store`) > 100) {
        invalid_fields["app_store"] <- "Invalid length for `app_store`, must be smaller than or equal to 100."
      }

      if (nchar(self$`app_version`) > 100) {
        invalid_fields["app_version"] <- "Invalid length for `app_version`, must be smaller than or equal to 100."
      }

      if (self$`install_time` < 0) {
        invalid_fields["install_time"] <- "Invalid value for `install_time`, must be bigger than or equal to 0."
      }

      if (nchar(self$`user_agent`) > 16384) {
        invalid_fields["user_agent"] <- "Invalid length for `user_agent`, must be smaller than or equal to 16384."
      }

      if (self$`window_height` > 30720) {
        invalid_fields["window_height"] <- "Invalid value for `window_height`, must be smaller than or equal to 30720."
      }
      if (self$`window_height` < 0) {
        invalid_fields["window_height"] <- "Invalid value for `window_height`, must be bigger than or equal to 0."
      }

      if (self$`window_width` > 30720) {
        invalid_fields["window_width"] <- "Invalid value for `window_width`, must be smaller than or equal to 30720."
      }
      if (self$`window_width` < 0) {
        invalid_fields["window_width"] <- "Invalid value for `window_width`, must be bigger than or equal to 0."
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
# ConversionEventAppInfo$unlock()
#
## Below is an example to define the print function
# ConversionEventAppInfo$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventAppInfo$lock()

