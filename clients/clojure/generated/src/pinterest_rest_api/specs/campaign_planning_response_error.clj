(ns pinterest-rest-api.specs.campaign-planning-response-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-response-error-code :refer :all]
            )
  (:import (java.io File)))


(def campaign-planning-response-error-data
  {
   (ds/opt :code) campaign-planning-response-error-code-spec
   (ds/opt :message) string?
   })

(def campaign-planning-response-error-spec
  (ds/spec
    {:name ::campaign-planning-response-error
     :spec campaign-planning-response-error-data}))
