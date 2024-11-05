(ns pinterest-rest-api.specs.conversion-tag-configs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-tag-configs-data
  {
   (ds/opt :aem_enabled) boolean?
   (ds/opt :md_frequency) float?
   (ds/opt :aem_fnln_enabled) boolean?
   (ds/opt :aem_ph_enabled) boolean?
   (ds/opt :aem_ge_enabled) boolean?
   (ds/opt :aem_db_enabled) boolean?
   (ds/opt :aem_loc_enabled) boolean?
   })

(def conversion-tag-configs-spec
  (ds/spec
    {:name ::conversion-tag-configs
     :spec conversion-tag-configs-data}))
