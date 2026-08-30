//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_type.g.dart';

class PinType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PRIVATE')
  static const PinType PRIVATE = _$PRIVATE;

  static Serializer<PinType> get serializer => _$pinTypeSerializer;

  const PinType._(String name): super(name);

  static BuiltSet<PinType> get values => _$values;
  static PinType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PinTypeMixin = Object with _$PinTypeMixin;

