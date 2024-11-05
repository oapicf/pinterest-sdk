(ns pinterest-rest-api.specs.pins-save-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pins-save-request-data
  {
   (ds/opt :board_id) string?
   (ds/opt :board_section_id) string?
   })

(def pins-save-request-spec
  (ds/spec
    {:name ::pins-save-request
     :spec pins-save-request-data}))
