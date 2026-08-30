//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'website_verification_method.g.dart';

class WebsiteVerificationMethod extends EnumClass {

  /// Method used to verify website ownership.
  @BuiltValueEnumConst(wireName: r'FILENAME')
  static const WebsiteVerificationMethod FILENAME = _$FILENAME;
  /// Method used to verify website ownership.
  @BuiltValueEnumConst(wireName: r'METATAG')
  static const WebsiteVerificationMethod METATAG = _$METATAG;
  /// Method used to verify website ownership.
  @BuiltValueEnumConst(wireName: r'DNSTXT')
  static const WebsiteVerificationMethod DNSTXT = _$DNSTXT;

  static Serializer<WebsiteVerificationMethod> get serializer => _$websiteVerificationMethodSerializer;

  const WebsiteVerificationMethod._(String name): super(name);

  static BuiltSet<WebsiteVerificationMethod> get values => _$values;
  static WebsiteVerificationMethod valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class WebsiteVerificationMethodMixin = Object with _$WebsiteVerificationMethodMixin;

