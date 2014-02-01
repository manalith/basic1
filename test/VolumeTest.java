import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void testEqualsOfVolume() throws Exception {
        Volume volume1 = new Volume(10, VolumeUnit.LITRE);
        Volume volume2 = new Volume(10, VolumeUnit.LITRE);
        assertEquals(true,volume1.equals(volume2));
    }
    @Test
    public void shouldGiveVolumeInSpecifiedUnit() throws Exception {
        Volume volumeInLitre = new Volume(10, VolumeUnit.LITRE);

        assertEquals(10.0, volumeInLitre.getValue());
        assertEquals(VolumeUnit.LITRE, volumeInLitre.getVolumeUnit());
    }
    @Test
    public void testShouldConvertLengthFromMililitreToLitre() throws Exception {
        Volume VolumeInMiliLitre = new Volume(1000, VolumeUnit.MILILITRE);

        Volume volumeInLitre = VolumeInMiliLitre.convertTo(VolumeUnit.LITRE);
        assertEquals(1.0, volumeInLitre.getValue());
        assertEquals(VolumeUnit.LITRE,volumeInLitre.getVolumeUnit());
    }
    @Test
    public void testShouldConvertLengthFromLitreToKiloLitre() throws Exception {
        Volume VolumeInLitre = new Volume(1000, VolumeUnit.LITRE);

        Volume volumeInKiloLitre = VolumeInLitre.convertTo(VolumeUnit.KILOLITRE);
        assertEquals(1.0, volumeInKiloLitre.getValue());
        assertEquals(VolumeUnit.KILOLITRE, volumeInKiloLitre.getVolumeUnit());
    }
    @Test
    public void testShouldConvertLengthFromKiloLitreToGallons() throws Exception {
        Volume volumeInKiloLitre = new Volume(1, VolumeUnit.KILOLITRE);

        Volume volumeInGallon = volumeInKiloLitre.convertTo(VolumeUnit.GALLON);
        assertEquals(volumeInGallon,volumeInKiloLitre);
        assertEquals(264.172052, volumeInGallon.getValue(),0.5);
        assertEquals(VolumeUnit.GALLON, volumeInGallon.getVolumeUnit());

    }
}