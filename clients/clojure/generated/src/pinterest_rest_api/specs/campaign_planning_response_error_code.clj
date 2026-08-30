(ns pinterest-rest-api.specs.campaign-planning-response-error-code
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-planning-response-error-code-data
  {
   })

(def campaign-planning-response-error-code-spec
  (ds/spec
    {:name ::campaign-planning-response-error-code
     :spec campaign-planning-response-error-code-data}))
