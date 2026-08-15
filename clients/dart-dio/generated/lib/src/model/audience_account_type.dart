//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_account_type.g.dart';

class AudienceAccountType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'AD_ACCOUNT')
  static const AudienceAccountType AD_ACCOUNT = _$AD_ACCOUNT;
  @BuiltValueEnumConst(wireName: r'BUSINESS_ACCOUNT')
  static const AudienceAccountType BUSINESS_ACCOUNT = _$BUSINESS_ACCOUNT;

  static Serializer<AudienceAccountType> get serializer => _$audienceAccountTypeSerializer;

  const AudienceAccountType._(String name): super(name);

  static BuiltSet<AudienceAccountType> get values => _$values;
  static AudienceAccountType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AudienceAccountTypeMixin = Object with _$AudienceAccountTypeMixin;

