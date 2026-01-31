#' Create a new ConversionEventDeviceInfo
#'
#' @description
#' Object containing information about the device where event occurred.
#'
#' @docType class
#' @title ConversionEventDeviceInfo
#' @description ConversionEventDeviceInfo Class
#' @format An \code{R6Class} generator object
#' @field battery_level Battery charge level percentage integer [optional]
#' @field brand Device brand character [optional]
#' @field carrier User device's mobile carrier. character [optional]
#' @field cpu_cores Number of CPU cores integer [optional]
#' @field external_storage_free_space External storage size in GB integer [optional]
#' @field external_storage_size External storage size in GB integer [optional]
#' @field form_factor Device form factor character [optional]
#' @field kernel_version Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release character [optional]
#' @field languages List of user installed languages. ISO 639-1 format list(character) [optional]
#' @field locale Device locale BCP-47 format character [optional]
#' @field model Device model name character [optional]
#' @field network_type Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() character [optional]
#' @field os_family OS Family character [optional]
#' @field os_name Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch character [optional]
#' @field os_release_name Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin character [optional]
#' @field os_version Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 character [optional]
#' @field screen_density Screen density, PPI integer [optional]
#' @field screen_height Screen height in pixels integer [optional]
#' @field screen_width Screen width in pixels integer [optional]
#' @field storage_free_space Internal storage size in GB integer [optional]
#' @field storage_size Internal storage size in GB integer [optional]
#' @field timezone Device timezone character [optional]
#' @field timezone_abbr Timezone abbreviation character [optional]
#' @field type Device type character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventDeviceInfo <- R6::R6Class(
  "ConversionEventDeviceInfo",
  public = list(
    `battery_level` = NULL,
    `brand` = NULL,
    `carrier` = NULL,
    `cpu_cores` = NULL,
    `external_storage_free_space` = NULL,
    `external_storage_size` = NULL,
    `form_factor` = NULL,
    `kernel_version` = NULL,
    `languages` = NULL,
    `locale` = NULL,
    `model` = NULL,
    `network_type` = NULL,
    `os_family` = NULL,
    `os_name` = NULL,
    `os_release_name` = NULL,
    `os_version` = NULL,
    `screen_density` = NULL,
    `screen_height` = NULL,
    `screen_width` = NULL,
    `storage_free_space` = NULL,
    `storage_size` = NULL,
    `timezone` = NULL,
    `timezone_abbr` = NULL,
    `type` = NULL,

    #' @description
    #' Initialize a new ConversionEventDeviceInfo class.
    #'
    #' @param battery_level Battery charge level percentage
    #' @param brand Device brand
    #' @param carrier User device's mobile carrier.
    #' @param cpu_cores Number of CPU cores
    #' @param external_storage_free_space External storage size in GB
    #' @param external_storage_size External storage size in GB
    #' @param form_factor Device form factor
    #' @param kernel_version Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
    #' @param languages List of user installed languages. ISO 639-1 format
    #' @param locale Device locale BCP-47 format
    #' @param model Device model name
    #' @param network_type Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
    #' @param os_family OS Family
    #' @param os_name Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
    #' @param os_release_name Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
    #' @param os_version Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
    #' @param screen_density Screen density, PPI
    #' @param screen_height Screen height in pixels
    #' @param screen_width Screen width in pixels
    #' @param storage_free_space Internal storage size in GB
    #' @param storage_size Internal storage size in GB
    #' @param timezone Device timezone
    #' @param timezone_abbr Timezone abbreviation
    #' @param type Device type
    #' @param ... Other optional arguments.
    initialize = function(`battery_level` = NULL, `brand` = NULL, `carrier` = NULL, `cpu_cores` = NULL, `external_storage_free_space` = NULL, `external_storage_size` = NULL, `form_factor` = NULL, `kernel_version` = NULL, `languages` = NULL, `locale` = NULL, `model` = NULL, `network_type` = NULL, `os_family` = NULL, `os_name` = NULL, `os_release_name` = NULL, `os_version` = NULL, `screen_density` = NULL, `screen_height` = NULL, `screen_width` = NULL, `storage_free_space` = NULL, `storage_size` = NULL, `timezone` = NULL, `timezone_abbr` = NULL, `type` = NULL, ...) {
      if (!is.null(`battery_level`)) {
        if (!(is.numeric(`battery_level`) && length(`battery_level`) == 1)) {
          stop(paste("Error! Invalid data for `battery_level`. Must be an integer:", `battery_level`))
        }
        self$`battery_level` <- `battery_level`
      }
      if (!is.null(`brand`)) {
        if (!(is.character(`brand`) && length(`brand`) == 1)) {
          stop(paste("Error! Invalid data for `brand`. Must be a string:", `brand`))
        }
        self$`brand` <- `brand`
      }
      if (!is.null(`carrier`)) {
        if (!(is.character(`carrier`) && length(`carrier`) == 1)) {
          stop(paste("Error! Invalid data for `carrier`. Must be a string:", `carrier`))
        }
        self$`carrier` <- `carrier`
      }
      if (!is.null(`cpu_cores`)) {
        if (!(is.numeric(`cpu_cores`) && length(`cpu_cores`) == 1)) {
          stop(paste("Error! Invalid data for `cpu_cores`. Must be an integer:", `cpu_cores`))
        }
        self$`cpu_cores` <- `cpu_cores`
      }
      if (!is.null(`external_storage_free_space`)) {
        if (!(is.numeric(`external_storage_free_space`) && length(`external_storage_free_space`) == 1)) {
          stop(paste("Error! Invalid data for `external_storage_free_space`. Must be an integer:", `external_storage_free_space`))
        }
        self$`external_storage_free_space` <- `external_storage_free_space`
      }
      if (!is.null(`external_storage_size`)) {
        if (!(is.numeric(`external_storage_size`) && length(`external_storage_size`) == 1)) {
          stop(paste("Error! Invalid data for `external_storage_size`. Must be an integer:", `external_storage_size`))
        }
        self$`external_storage_size` <- `external_storage_size`
      }
      if (!is.null(`form_factor`)) {
        if (!(`form_factor` %in% c("desktop", "laptop", "cellphone", "tablet", "smartwatch", "tv", "vr", "console", "other"))) {
          stop(paste("Error! \"", `form_factor`, "\" cannot be assigned to `form_factor`. Must be \"desktop\", \"laptop\", \"cellphone\", \"tablet\", \"smartwatch\", \"tv\", \"vr\", \"console\", \"other\".", sep = ""))
        }
        if (!(is.character(`form_factor`) && length(`form_factor`) == 1)) {
          stop(paste("Error! Invalid data for `form_factor`. Must be a string:", `form_factor`))
        }
        self$`form_factor` <- `form_factor`
      }
      if (!is.null(`kernel_version`)) {
        if (!(is.character(`kernel_version`) && length(`kernel_version`) == 1)) {
          stop(paste("Error! Invalid data for `kernel_version`. Must be a string:", `kernel_version`))
        }
        self$`kernel_version` <- `kernel_version`
      }
      if (!is.null(`languages`)) {
        stopifnot(is.vector(`languages`), length(`languages`) != 0)
        sapply(`languages`, function(x) stopifnot(is.character(x)))
        self$`languages` <- `languages`
      }
      if (!is.null(`locale`)) {
        if (!(is.character(`locale`) && length(`locale`) == 1)) {
          stop(paste("Error! Invalid data for `locale`. Must be a string:", `locale`))
        }
        self$`locale` <- `locale`
      }
      if (!is.null(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!is.null(`network_type`)) {
        if (!(`network_type` %in% c("wifi", "cellular_2g", "cellular_3g", "cellular_4g", "cellular_5g", "cellular_6g", "ethernet", "unknown"))) {
          stop(paste("Error! \"", `network_type`, "\" cannot be assigned to `network_type`. Must be \"wifi\", \"cellular_2g\", \"cellular_3g\", \"cellular_4g\", \"cellular_5g\", \"cellular_6g\", \"ethernet\", \"unknown\".", sep = ""))
        }
        if (!(is.character(`network_type`) && length(`network_type`) == 1)) {
          stop(paste("Error! Invalid data for `network_type`. Must be a string:", `network_type`))
        }
        self$`network_type` <- `network_type`
      }
      if (!is.null(`os_family`)) {
        if (!(`os_family` %in% c("ios", "android", "macos", "windows", "linux", "bsd", "other"))) {
          stop(paste("Error! \"", `os_family`, "\" cannot be assigned to `os_family`. Must be \"ios\", \"android\", \"macos\", \"windows\", \"linux\", \"bsd\", \"other\".", sep = ""))
        }
        if (!(is.character(`os_family`) && length(`os_family`) == 1)) {
          stop(paste("Error! Invalid data for `os_family`. Must be a string:", `os_family`))
        }
        self$`os_family` <- `os_family`
      }
      if (!is.null(`os_name`)) {
        if (!(is.character(`os_name`) && length(`os_name`) == 1)) {
          stop(paste("Error! Invalid data for `os_name`. Must be a string:", `os_name`))
        }
        self$`os_name` <- `os_name`
      }
      if (!is.null(`os_release_name`)) {
        if (!(is.character(`os_release_name`) && length(`os_release_name`) == 1)) {
          stop(paste("Error! Invalid data for `os_release_name`. Must be a string:", `os_release_name`))
        }
        self$`os_release_name` <- `os_release_name`
      }
      if (!is.null(`os_version`)) {
        if (!(is.character(`os_version`) && length(`os_version`) == 1)) {
          stop(paste("Error! Invalid data for `os_version`. Must be a string:", `os_version`))
        }
        self$`os_version` <- `os_version`
      }
      if (!is.null(`screen_density`)) {
        if (!(is.numeric(`screen_density`) && length(`screen_density`) == 1)) {
          stop(paste("Error! Invalid data for `screen_density`. Must be an integer:", `screen_density`))
        }
        self$`screen_density` <- `screen_density`
      }
      if (!is.null(`screen_height`)) {
        if (!(is.numeric(`screen_height`) && length(`screen_height`) == 1)) {
          stop(paste("Error! Invalid data for `screen_height`. Must be an integer:", `screen_height`))
        }
        self$`screen_height` <- `screen_height`
      }
      if (!is.null(`screen_width`)) {
        if (!(is.numeric(`screen_width`) && length(`screen_width`) == 1)) {
          stop(paste("Error! Invalid data for `screen_width`. Must be an integer:", `screen_width`))
        }
        self$`screen_width` <- `screen_width`
      }
      if (!is.null(`storage_free_space`)) {
        if (!(is.numeric(`storage_free_space`) && length(`storage_free_space`) == 1)) {
          stop(paste("Error! Invalid data for `storage_free_space`. Must be an integer:", `storage_free_space`))
        }
        self$`storage_free_space` <- `storage_free_space`
      }
      if (!is.null(`storage_size`)) {
        if (!(is.numeric(`storage_size`) && length(`storage_size`) == 1)) {
          stop(paste("Error! Invalid data for `storage_size`. Must be an integer:", `storage_size`))
        }
        self$`storage_size` <- `storage_size`
      }
      if (!is.null(`timezone`)) {
        if (!(is.character(`timezone`) && length(`timezone`) == 1)) {
          stop(paste("Error! Invalid data for `timezone`. Must be a string:", `timezone`))
        }
        self$`timezone` <- `timezone`
      }
      if (!is.null(`timezone_abbr`)) {
        if (!(is.character(`timezone_abbr`) && length(`timezone_abbr`) == 1)) {
          stop(paste("Error! Invalid data for `timezone_abbr`. Must be a string:", `timezone_abbr`))
        }
        self$`timezone_abbr` <- `timezone_abbr`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
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
    #' @return ConversionEventDeviceInfo as a base R list.
    #' @examples
    #' # convert array of ConversionEventDeviceInfo (x) to a data frame
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
    #' Convert ConversionEventDeviceInfo to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionEventDeviceInfoObject <- list()
      if (!is.null(self$`battery_level`)) {
        ConversionEventDeviceInfoObject[["battery_level"]] <-
          self$`battery_level`
      }
      if (!is.null(self$`brand`)) {
        ConversionEventDeviceInfoObject[["brand"]] <-
          self$`brand`
      }
      if (!is.null(self$`carrier`)) {
        ConversionEventDeviceInfoObject[["carrier"]] <-
          self$`carrier`
      }
      if (!is.null(self$`cpu_cores`)) {
        ConversionEventDeviceInfoObject[["cpu_cores"]] <-
          self$`cpu_cores`
      }
      if (!is.null(self$`external_storage_free_space`)) {
        ConversionEventDeviceInfoObject[["external_storage_free_space"]] <-
          self$`external_storage_free_space`
      }
      if (!is.null(self$`external_storage_size`)) {
        ConversionEventDeviceInfoObject[["external_storage_size"]] <-
          self$`external_storage_size`
      }
      if (!is.null(self$`form_factor`)) {
        ConversionEventDeviceInfoObject[["form_factor"]] <-
          self$`form_factor`
      }
      if (!is.null(self$`kernel_version`)) {
        ConversionEventDeviceInfoObject[["kernel_version"]] <-
          self$`kernel_version`
      }
      if (!is.null(self$`languages`)) {
        ConversionEventDeviceInfoObject[["languages"]] <-
          self$`languages`
      }
      if (!is.null(self$`locale`)) {
        ConversionEventDeviceInfoObject[["locale"]] <-
          self$`locale`
      }
      if (!is.null(self$`model`)) {
        ConversionEventDeviceInfoObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`network_type`)) {
        ConversionEventDeviceInfoObject[["network_type"]] <-
          self$`network_type`
      }
      if (!is.null(self$`os_family`)) {
        ConversionEventDeviceInfoObject[["os_family"]] <-
          self$`os_family`
      }
      if (!is.null(self$`os_name`)) {
        ConversionEventDeviceInfoObject[["os_name"]] <-
          self$`os_name`
      }
      if (!is.null(self$`os_release_name`)) {
        ConversionEventDeviceInfoObject[["os_release_name"]] <-
          self$`os_release_name`
      }
      if (!is.null(self$`os_version`)) {
        ConversionEventDeviceInfoObject[["os_version"]] <-
          self$`os_version`
      }
      if (!is.null(self$`screen_density`)) {
        ConversionEventDeviceInfoObject[["screen_density"]] <-
          self$`screen_density`
      }
      if (!is.null(self$`screen_height`)) {
        ConversionEventDeviceInfoObject[["screen_height"]] <-
          self$`screen_height`
      }
      if (!is.null(self$`screen_width`)) {
        ConversionEventDeviceInfoObject[["screen_width"]] <-
          self$`screen_width`
      }
      if (!is.null(self$`storage_free_space`)) {
        ConversionEventDeviceInfoObject[["storage_free_space"]] <-
          self$`storage_free_space`
      }
      if (!is.null(self$`storage_size`)) {
        ConversionEventDeviceInfoObject[["storage_size"]] <-
          self$`storage_size`
      }
      if (!is.null(self$`timezone`)) {
        ConversionEventDeviceInfoObject[["timezone"]] <-
          self$`timezone`
      }
      if (!is.null(self$`timezone_abbr`)) {
        ConversionEventDeviceInfoObject[["timezone_abbr"]] <-
          self$`timezone_abbr`
      }
      if (!is.null(self$`type`)) {
        ConversionEventDeviceInfoObject[["type"]] <-
          self$`type`
      }
      return(ConversionEventDeviceInfoObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventDeviceInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventDeviceInfo
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`battery_level`)) {
        self$`battery_level` <- this_object$`battery_level`
      }
      if (!is.null(this_object$`brand`)) {
        self$`brand` <- this_object$`brand`
      }
      if (!is.null(this_object$`carrier`)) {
        self$`carrier` <- this_object$`carrier`
      }
      if (!is.null(this_object$`cpu_cores`)) {
        self$`cpu_cores` <- this_object$`cpu_cores`
      }
      if (!is.null(this_object$`external_storage_free_space`)) {
        self$`external_storage_free_space` <- this_object$`external_storage_free_space`
      }
      if (!is.null(this_object$`external_storage_size`)) {
        self$`external_storage_size` <- this_object$`external_storage_size`
      }
      if (!is.null(this_object$`form_factor`)) {
        if (!is.null(this_object$`form_factor`) && !(this_object$`form_factor` %in% c("desktop", "laptop", "cellphone", "tablet", "smartwatch", "tv", "vr", "console", "other"))) {
          stop(paste("Error! \"", this_object$`form_factor`, "\" cannot be assigned to `form_factor`. Must be \"desktop\", \"laptop\", \"cellphone\", \"tablet\", \"smartwatch\", \"tv\", \"vr\", \"console\", \"other\".", sep = ""))
        }
        self$`form_factor` <- this_object$`form_factor`
      }
      if (!is.null(this_object$`kernel_version`)) {
        self$`kernel_version` <- this_object$`kernel_version`
      }
      if (!is.null(this_object$`languages`)) {
        self$`languages` <- ApiClient$new()$deserializeObj(this_object$`languages`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`locale`)) {
        self$`locale` <- this_object$`locale`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`network_type`)) {
        if (!is.null(this_object$`network_type`) && !(this_object$`network_type` %in% c("wifi", "cellular_2g", "cellular_3g", "cellular_4g", "cellular_5g", "cellular_6g", "ethernet", "unknown"))) {
          stop(paste("Error! \"", this_object$`network_type`, "\" cannot be assigned to `network_type`. Must be \"wifi\", \"cellular_2g\", \"cellular_3g\", \"cellular_4g\", \"cellular_5g\", \"cellular_6g\", \"ethernet\", \"unknown\".", sep = ""))
        }
        self$`network_type` <- this_object$`network_type`
      }
      if (!is.null(this_object$`os_family`)) {
        if (!is.null(this_object$`os_family`) && !(this_object$`os_family` %in% c("ios", "android", "macos", "windows", "linux", "bsd", "other"))) {
          stop(paste("Error! \"", this_object$`os_family`, "\" cannot be assigned to `os_family`. Must be \"ios\", \"android\", \"macos\", \"windows\", \"linux\", \"bsd\", \"other\".", sep = ""))
        }
        self$`os_family` <- this_object$`os_family`
      }
      if (!is.null(this_object$`os_name`)) {
        self$`os_name` <- this_object$`os_name`
      }
      if (!is.null(this_object$`os_release_name`)) {
        self$`os_release_name` <- this_object$`os_release_name`
      }
      if (!is.null(this_object$`os_version`)) {
        self$`os_version` <- this_object$`os_version`
      }
      if (!is.null(this_object$`screen_density`)) {
        self$`screen_density` <- this_object$`screen_density`
      }
      if (!is.null(this_object$`screen_height`)) {
        self$`screen_height` <- this_object$`screen_height`
      }
      if (!is.null(this_object$`screen_width`)) {
        self$`screen_width` <- this_object$`screen_width`
      }
      if (!is.null(this_object$`storage_free_space`)) {
        self$`storage_free_space` <- this_object$`storage_free_space`
      }
      if (!is.null(this_object$`storage_size`)) {
        self$`storage_size` <- this_object$`storage_size`
      }
      if (!is.null(this_object$`timezone`)) {
        self$`timezone` <- this_object$`timezone`
      }
      if (!is.null(this_object$`timezone_abbr`)) {
        self$`timezone_abbr` <- this_object$`timezone_abbr`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionEventDeviceInfo in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventDeviceInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventDeviceInfo
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`battery_level` <- this_object$`battery_level`
      self$`brand` <- this_object$`brand`
      self$`carrier` <- this_object$`carrier`
      self$`cpu_cores` <- this_object$`cpu_cores`
      self$`external_storage_free_space` <- this_object$`external_storage_free_space`
      self$`external_storage_size` <- this_object$`external_storage_size`
      if (!is.null(this_object$`form_factor`) && !(this_object$`form_factor` %in% c("desktop", "laptop", "cellphone", "tablet", "smartwatch", "tv", "vr", "console", "other"))) {
        stop(paste("Error! \"", this_object$`form_factor`, "\" cannot be assigned to `form_factor`. Must be \"desktop\", \"laptop\", \"cellphone\", \"tablet\", \"smartwatch\", \"tv\", \"vr\", \"console\", \"other\".", sep = ""))
      }
      self$`form_factor` <- this_object$`form_factor`
      self$`kernel_version` <- this_object$`kernel_version`
      self$`languages` <- ApiClient$new()$deserializeObj(this_object$`languages`, "array[character]", loadNamespace("openapi"))
      self$`locale` <- this_object$`locale`
      self$`model` <- this_object$`model`
      if (!is.null(this_object$`network_type`) && !(this_object$`network_type` %in% c("wifi", "cellular_2g", "cellular_3g", "cellular_4g", "cellular_5g", "cellular_6g", "ethernet", "unknown"))) {
        stop(paste("Error! \"", this_object$`network_type`, "\" cannot be assigned to `network_type`. Must be \"wifi\", \"cellular_2g\", \"cellular_3g\", \"cellular_4g\", \"cellular_5g\", \"cellular_6g\", \"ethernet\", \"unknown\".", sep = ""))
      }
      self$`network_type` <- this_object$`network_type`
      if (!is.null(this_object$`os_family`) && !(this_object$`os_family` %in% c("ios", "android", "macos", "windows", "linux", "bsd", "other"))) {
        stop(paste("Error! \"", this_object$`os_family`, "\" cannot be assigned to `os_family`. Must be \"ios\", \"android\", \"macos\", \"windows\", \"linux\", \"bsd\", \"other\".", sep = ""))
      }
      self$`os_family` <- this_object$`os_family`
      self$`os_name` <- this_object$`os_name`
      self$`os_release_name` <- this_object$`os_release_name`
      self$`os_version` <- this_object$`os_version`
      self$`screen_density` <- this_object$`screen_density`
      self$`screen_height` <- this_object$`screen_height`
      self$`screen_width` <- this_object$`screen_width`
      self$`storage_free_space` <- this_object$`storage_free_space`
      self$`storage_size` <- this_object$`storage_size`
      self$`timezone` <- this_object$`timezone`
      self$`timezone_abbr` <- this_object$`timezone_abbr`
      self$`type` <- this_object$`type`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventDeviceInfo and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventDeviceInfo
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`battery_level` > 100) {
        return(FALSE)
      }
      if (self$`battery_level` < 0) {
        return(FALSE)
      }

      if (nchar(self$`brand`) > 100) {
        return(FALSE)
      }

      if (nchar(self$`carrier`) > 100) {
        return(FALSE)
      }

      if (self$`cpu_cores` > 1152) {
        return(FALSE)
      }
      if (self$`cpu_cores` < 0) {
        return(FALSE)
      }

      if (self$`external_storage_free_space` > 1048576) {
        return(FALSE)
      }
      if (self$`external_storage_free_space` < 0) {
        return(FALSE)
      }

      if (self$`external_storage_size` > 1048576) {
        return(FALSE)
      }
      if (self$`external_storage_size` < 0) {
        return(FALSE)
      }

      if (nchar(self$`kernel_version`) > 100) {
        return(FALSE)
      }

      if (length(self$`languages`) > 100) {
        return(FALSE)
      }
      if (length(self$`languages`) < 0) {
        return(FALSE)
      }

      if (nchar(self$`locale`) > 35) {
        return(FALSE)
      }

      if (nchar(self$`model`) > 100) {
        return(FALSE)
      }

      if (nchar(self$`os_name`) > 100) {
        return(FALSE)
      }

      if (nchar(self$`os_release_name`) > 100) {
        return(FALSE)
      }

      if (nchar(self$`os_version`) > 100) {
        return(FALSE)
      }

      if (self$`screen_density` > 100000) {
        return(FALSE)
      }
      if (self$`screen_density` < 0) {
        return(FALSE)
      }

      if (self$`screen_height` > 30720) {
        return(FALSE)
      }
      if (self$`screen_height` < 0) {
        return(FALSE)
      }

      if (self$`screen_width` > 30720) {
        return(FALSE)
      }
      if (self$`screen_width` < 0) {
        return(FALSE)
      }

      if (self$`storage_free_space` > 1048576) {
        return(FALSE)
      }
      if (self$`storage_free_space` < 0) {
        return(FALSE)
      }

      if (self$`storage_size` > 1048576) {
        return(FALSE)
      }
      if (self$`storage_size` < 0) {
        return(FALSE)
      }

      if (nchar(self$`timezone`) > 40) {
        return(FALSE)
      }

      if (nchar(self$`timezone_abbr`) > 5) {
        return(FALSE)
      }

      if (nchar(self$`type`) > 100) {
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
      if (self$`battery_level` > 100) {
        invalid_fields["battery_level"] <- "Invalid value for `battery_level`, must be smaller than or equal to 100."
      }
      if (self$`battery_level` < 0) {
        invalid_fields["battery_level"] <- "Invalid value for `battery_level`, must be bigger than or equal to 0."
      }

      if (nchar(self$`brand`) > 100) {
        invalid_fields["brand"] <- "Invalid length for `brand`, must be smaller than or equal to 100."
      }

      if (nchar(self$`carrier`) > 100) {
        invalid_fields["carrier"] <- "Invalid length for `carrier`, must be smaller than or equal to 100."
      }

      if (self$`cpu_cores` > 1152) {
        invalid_fields["cpu_cores"] <- "Invalid value for `cpu_cores`, must be smaller than or equal to 1152."
      }
      if (self$`cpu_cores` < 0) {
        invalid_fields["cpu_cores"] <- "Invalid value for `cpu_cores`, must be bigger than or equal to 0."
      }

      if (self$`external_storage_free_space` > 1048576) {
        invalid_fields["external_storage_free_space"] <- "Invalid value for `external_storage_free_space`, must be smaller than or equal to 1048576."
      }
      if (self$`external_storage_free_space` < 0) {
        invalid_fields["external_storage_free_space"] <- "Invalid value for `external_storage_free_space`, must be bigger than or equal to 0."
      }

      if (self$`external_storage_size` > 1048576) {
        invalid_fields["external_storage_size"] <- "Invalid value for `external_storage_size`, must be smaller than or equal to 1048576."
      }
      if (self$`external_storage_size` < 0) {
        invalid_fields["external_storage_size"] <- "Invalid value for `external_storage_size`, must be bigger than or equal to 0."
      }

      if (nchar(self$`kernel_version`) > 100) {
        invalid_fields["kernel_version"] <- "Invalid length for `kernel_version`, must be smaller than or equal to 100."
      }

      if (length(self$`languages`) > 100) {
        invalid_fields["languages"] <- "Invalid length for `languages`, number of items must be less than or equal to 100."
      }
      if (length(self$`languages`) < 0) {
        invalid_fields["languages"] <- "Invalid length for ``, number of items must be greater than or equal to 0."
      }

      if (nchar(self$`locale`) > 35) {
        invalid_fields["locale"] <- "Invalid length for `locale`, must be smaller than or equal to 35."
      }

      if (nchar(self$`model`) > 100) {
        invalid_fields["model"] <- "Invalid length for `model`, must be smaller than or equal to 100."
      }

      if (nchar(self$`os_name`) > 100) {
        invalid_fields["os_name"] <- "Invalid length for `os_name`, must be smaller than or equal to 100."
      }

      if (nchar(self$`os_release_name`) > 100) {
        invalid_fields["os_release_name"] <- "Invalid length for `os_release_name`, must be smaller than or equal to 100."
      }

      if (nchar(self$`os_version`) > 100) {
        invalid_fields["os_version"] <- "Invalid length for `os_version`, must be smaller than or equal to 100."
      }

      if (self$`screen_density` > 100000) {
        invalid_fields["screen_density"] <- "Invalid value for `screen_density`, must be smaller than or equal to 100000."
      }
      if (self$`screen_density` < 0) {
        invalid_fields["screen_density"] <- "Invalid value for `screen_density`, must be bigger than or equal to 0."
      }

      if (self$`screen_height` > 30720) {
        invalid_fields["screen_height"] <- "Invalid value for `screen_height`, must be smaller than or equal to 30720."
      }
      if (self$`screen_height` < 0) {
        invalid_fields["screen_height"] <- "Invalid value for `screen_height`, must be bigger than or equal to 0."
      }

      if (self$`screen_width` > 30720) {
        invalid_fields["screen_width"] <- "Invalid value for `screen_width`, must be smaller than or equal to 30720."
      }
      if (self$`screen_width` < 0) {
        invalid_fields["screen_width"] <- "Invalid value for `screen_width`, must be bigger than or equal to 0."
      }

      if (self$`storage_free_space` > 1048576) {
        invalid_fields["storage_free_space"] <- "Invalid value for `storage_free_space`, must be smaller than or equal to 1048576."
      }
      if (self$`storage_free_space` < 0) {
        invalid_fields["storage_free_space"] <- "Invalid value for `storage_free_space`, must be bigger than or equal to 0."
      }

      if (self$`storage_size` > 1048576) {
        invalid_fields["storage_size"] <- "Invalid value for `storage_size`, must be smaller than or equal to 1048576."
      }
      if (self$`storage_size` < 0) {
        invalid_fields["storage_size"] <- "Invalid value for `storage_size`, must be bigger than or equal to 0."
      }

      if (nchar(self$`timezone`) > 40) {
        invalid_fields["timezone"] <- "Invalid length for `timezone`, must be smaller than or equal to 40."
      }

      if (nchar(self$`timezone_abbr`) > 5) {
        invalid_fields["timezone_abbr"] <- "Invalid length for `timezone_abbr`, must be smaller than or equal to 5."
      }

      if (nchar(self$`type`) > 100) {
        invalid_fields["type"] <- "Invalid length for `type`, must be smaller than or equal to 100."
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
# ConversionEventDeviceInfo$unlock()
#
## Below is an example to define the print function
# ConversionEventDeviceInfo$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventDeviceInfo$lock()

