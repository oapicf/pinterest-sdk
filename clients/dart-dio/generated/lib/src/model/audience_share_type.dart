//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_share_type.g.dart';

class AudienceShareType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SHARED')
  static const AudienceShareType SHARED = _$SHARED;
  @BuiltValueEnumConst(wireName: r'RECEIVED')
  static const AudienceShareType RECEIVED = _$RECEIVED;

  static Serializer<AudienceShareType> get serializer => _$audienceShareTypeSerializer;

  const AudienceShareType._(String name): super(name);

  static BuiltSet<AudienceShareType> get values => _$values;
  static AudienceShareType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AudienceShareTypeMixin = Object with _$AudienceShareTypeMixin;

