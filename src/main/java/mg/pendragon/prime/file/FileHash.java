package mg.pendragon.prime.file;

import mg.pendragon.prime.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
